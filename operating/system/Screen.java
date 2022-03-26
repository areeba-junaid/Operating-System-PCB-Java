package operating.system;

public class Screen {


void Display_Instructions( Node Curr)
	{
		System.out.println("\t\t=================================");
		System.out.println("\n\t\tThe Values Of Instructions Executed ");
	    for(int i=0;i<=Curr.totalExecuted;i++)
	    {
	    	System.out.println("\t\t\t"+Curr.Process[i]);
	    }
	    System.out.println("\n\t\t=================================");
	}
	void Display( Node curr,int Q,int Ir,Node Pc)
	{
		
		System.out.println("\n*************************************************************************************************************");
		System.out.println ("\n\t\tPCB OF PROCESS: "+(curr.ProgramId));
		System.out.println ("\t\t---------------" );
		System.out.println("\n\t\tExecution Time: "+( curr.totalInstruction));
		System.out.println("\t\tArrival Time: "+curr.arrivalTime);
		System.out.println("\t\tTotal Instruction: "+curr.totalInstruction);
		System.out.println("\t\tQuantum: " + Q);
		System.out.println("\t\tAlgorithm: \"Round-Robin\"");
	    Display_Instructions(curr);
	    if(Ir==-1 && Pc==null)
	    {
	    	System.out.println("\t\tIR: none");
	    	System.out.println("\t\tPC: none");
	    }
	    else if(Ir!=-1 && Pc !=null)
	    {
	    	System.out.println("\t\tIR: "+ Ir);
	    	System.out.println("\t\tPC: "+ Pc.ProgramId);
	    }
	}


}
