package operating.system;
import java.util.Scanner;
public class PCB {

	
	int Quantum ;
	public static void main(String[] args) {
		
		System.out.print("Enter number of process you want to execute: ");  
	    Scanner myInput = new Scanner(System.in);
		int totalProcess = myInput.nextInt();
		while(totalProcess<=0)
		{   System.out.println("\n\t\tOPPs InCorrect....");
		    totalProcess = myInput.nextInt();
		}
		System.out.print("Enter your Quantum from 1 till 3: ");
		int Quantum=myInput.nextInt();
		while (Quantum < 1 || Quantum >3)
		{
			System.out.print("Enter fixed Quantum in correct Range: ");
		     Quantum=myInput.nextInt();	
		}
	ReadyQueue Queue=new ReadyQueue();
	 for(int i=1;i<=totalProcess;i++)
     {
		 System.out.print("\n\t\tEnter total instructions of Process"+i+":");
         int totalInstruction=myInput.nextInt();
         if(totalInstruction>10 || totalInstruction<1)
         {
             i=i-1;
             System.out.println("\n\t\tOOps Max Instruction can be 10........TRY AGAIN!!!");
             continue;
         }
         Queue.Enqueue(totalInstruction);
     }
	 Processor P=new Processor();
	 P.Execution(Quantum,Queue.front,0 ,0);
	}
	
}


