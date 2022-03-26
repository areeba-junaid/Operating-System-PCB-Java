package operating.system;


public class Node {
	
    static int programCounter=0;
    static int arrivalTimeCounter=-1;
	int  ProgramId=0;
	int totalInstruction;
	int totalExecuted=-1;
    int arrivalTime=-1;
	Node Next;
	int[] Process;
	

public Node(int totalInstructions)
	{
	arrivalTimeCounter++;	 
	programCounter++;
	this.totalInstruction=totalInstructions;
	this.arrivalTime=arrivalTimeCounter;
	this.ProgramId=programCounter; 
	this.Process=new int[totalInstruction];
	}


}

