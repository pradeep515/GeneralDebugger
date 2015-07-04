package debugtool;

import java.util.ArrayList;
import java.util.Scanner;

public class debugstart {
	
	public static void main(String[] args)
	{
		     Boolean running = true;
		     System.out.println(" ");
		     System.out.println(" ");
			 System.out.println("              &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			 System.out.println("              &&&&&&&&&&&&&                                                                                       &&&&&&&&&&&&&");
			 System.out.println("              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ GENERAL DEBUG TOOL @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			 System.out.println("              &&&&&&&&&&&&&                                                                                       &&&&&&&&&&&&&");
			 System.out.println("              &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			 System.out.println(" ");
			 System.out.println(" ");
			 
		      while(running)
		        {        systemProperties sp = new systemProperties();
		    	         System.out.println(" ");
						 System.out.println("PLEASE CHOOSE YOUR OPTIONS FROM BELOW");
						 System.out.println(" ");
						 System.out.println("1) Print System Properties    2) Print TCP/UDP/Port information    3) Network Packet Capture    4) Java Diagnoistic tool    5) clear Screen");
						 System.out.println("6) Exit");
						 Scanner sc = new Scanner(System.in);
					try{
						 int k = sc.nextInt();
					       if(k==1)
							       {  
							                   sp.printSystemProperties();
							       }
					       
					       else if(k==2)
							        {  
							    	    networking np = new networking();
							    	       np.netstatRunner();
							        	 
							        }
					       else if(k==3)
							       {
							    	    while(running)
							    	    {	 PacketCapture pc = new PacketCapture(); 
							    	    	 System.out.println(" ");
											 System.out.println("PLEASE CHOOSE YOUR OPTIONS FROM BELOW");
											 System.out.println(" ");
											 System.out.println("1) Packet Capture    2) Packet MetaData   3) Return to Main Menu   4) Clear Screen"); 
											 Scanner sc1 = new Scanner(System.in);
											 int packetoption = sc1.nextInt();
											 
											 if(packetoption==1)
														 {
												    	     ArrayList<String> interfaceinfo = pc.getInterfaceinfo();
												    	     if(interfaceinfo.size()==0)
												    	     	{}
													    	  else{
													    		  	pc.Interfacechooser(interfaceinfo);
													    	  		}
														 }
											 else if(packetoption==2)
														 {      
												               pc.packetAnalyzer();
														 }
											 else if(packetoption==3) 
														 {
															 break;
														 }
											 else if(packetoption==3) 
														 {
															  sp.clearScreen();
														 }
											 else  
														  {
															  System.out.println("Invalid option choosen , so returning back to the current menu");
														 }
							    	    }
							       }
					       else if(k==6)
							       {
							    	    break;
							       }
					       else if(k==4)
							       {
							    	    javaDiagnoistictool jd = new javaDiagnoistictool();
							    	    jd.getRunningJavaProcessids();
							       }
					       else if(k==5)
							       {  
					    	              sp.clearScreen(); 

							       }
					       else
							       {
							    	    System.out.println("No proper option is selected , returning to main menu");
							    	   
							       }
					       System.out.println(" ");
					       System.out.println("############ PRESS CTRL+C ANYTIME TO END THE PROGRAM ###############");
					       System.out.println(" ");
					       
					}catch(Exception ex)
					{
						 System.out.println("Please enter an integer, not a String..... Try again");
					}
				   }
	 }

}