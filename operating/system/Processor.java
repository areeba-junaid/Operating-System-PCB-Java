package operating.system;

public class Processor {

 ReadyQueue Queue=new ReadyQueue();
Screen screen=new Screen();
 int IR;
 Node PC;
int Quantum;


public void Execution(int Q, Node PC,int instruction,int flag)
	{   IR=instruction;
	    Node curr=PC;
	    for(int i=1;i<=Q;i++)
	    {   if(Check_Deletion(curr)==1)
	        {  flag=1;
	            break;
	        }
	        else
	        {  curr.totalExecuted=IR;
	            IR=IR+1;
	        }
	    }
	    if(Check_Deletion(curr)==1)
	        flag=1;
	    PC=ProcessSwitch(curr);
	    Set_IR(PC);  
	    screen.Display(curr,Q,IR,PC);
	    if(flag==1)
	    	Queue.Remove(ReadyQueue.front ,curr);
	    
	    if(PC != null)
	        Execution(Q,PC,IR,0);
	    else
	        return;
	}	


int Check_Deletion( Node curr)
{
   if(curr.totalInstruction-1== curr.totalExecuted)
    {return 1;}
    else
     return 0;
}
Node ProcessSwitch( Node curr)
{
    if(ReadyQueue.front==ReadyQueue.rear && ReadyQueue.front.totalExecuted==ReadyQueue.front.totalInstruction-1)
    { return null;}
    else
       return curr.Next;
}
void Set_IR( Node curr)
{
    if(curr==null)
    {IR=-1;}
    else
    {IR=curr.totalExecuted+1;}
}
}