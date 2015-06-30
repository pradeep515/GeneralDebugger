package debugtool;

import java.util.ArrayList;
import java.util.Scanner;

public class debugstart {
	
	public static void main(String[] args)
	{
		     Boolean running = true;
		     System.out.println(" ");
			 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			 System.out.println("&&&&&&&                                                                                        &&&&&&&&");
			 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ GENERAL DEBUG TOOL @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			 System.out.println("&&&&&&&                                                                                        &&&&&&&&");
			 System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			 System.out.println(" ");
			 
		      while(running)
		        { 
		    	         
						 System.out.println("PLEASE CHOOSE YOUR OPTIONS FROM BELOW");
						 System.out.println("1) Your system properties    2) Your tcp connections information    3) Network Packet Capture  4) Exit "); 
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
					       else if(k ==3)
					       {
					    	     PacketCapture pc = new PacketCapture(); 
					    	     ArrayList<String> interfaceinfo = pc.getInterfaceinfo();
					    	     if(interfaceinfo.size()==0)
					    	     {}
					    	     else{
					    	     pc.Interfacechooser(interfaceinfo);
					    	     }
					       }
					       else if(k ==4)
					       {
					    	    break;
					       }
					       else
					       {
					    	    System.out.println("No proper option is selected , going back");
					    	   
					       }
					       System.out.println(" ");
					       System.out.println("############ PRESS CTRL+C ANYTIME TO END THE PROGRAM ###############");
				   }
	 }

}