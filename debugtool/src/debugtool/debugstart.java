package debugtool;

import java.util.Scanner;

public class debugstart {
	
	public static void main(String[] args)
	{
		
	 System.out.println("#################################################################");
	 System.out.println("####################### DEBUG TOOL ##############################");
	 System.out.println("#################################################################");
	 System.out.println("PLEASE CHOOSE YOUR OPTIONS FROM BELOW");
	 System.out.println("1) Your system properties    2) Your tcp connections information");
	 Scanner sc = new Scanner(System.in);
	 int k = sc.nextInt();
       if(k==1)
       {   systemProperties sp = new systemProperties();
                   sp.printSystemProperties();
    	    
       }
       
       else if(k==2)
        {  
    	    networking np = new networking();
    	       np.netstatRunner();
        	 
        }
       else
       {
    	    System.out.println("No option is selected , so logging out");
       }
	}

}