package debugtool;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author pkaliset
 *  Packet Capture class enables the general debug tool to take tcp packet captures an write them to a file. Tshark must be installed on 
 *  the system for it to work. 
 *
 */
public class PacketCapture {
	private String line;
	private static String wiresharkhome;
	protected static ArrayList<String> interfaceArrayList ;
	public PacketCapture pc;
	public ArrayList<String> getInterfaceinfo(){
				try{
					    interfaceArrayList = new ArrayList<String>();
			             if(wiresharkhome==null)
			             {
			            	  pc = new PacketCapture();
			            	  pc.setWireSharkHome();
			              }
						 Process p = Runtime.getRuntime().exec(wiresharkhome+"/tshark.exe -D");
						 InputStreamReader ir = new InputStreamReader(p.getInputStream());
						 BufferedReader br = new BufferedReader(ir);
						 while((line = br.readLine()) != null)
								 {   
								 interfaceArrayList.add(line);
								 }
						 br.close();
		               
			         }
				catch(Exception ex)
						{    wiresharkhome = null;
							 System.out.println("Unable to check the device list , check your wireshark install entry once again");
						}
				return interfaceArrayList;
			    
		    }
  	public void Interfacechooser(ArrayList<String> interfacechooser)
	  	{
  		  try{
	  		    System.out.println("Available interfaces on your system are listed below. Please choose which interface you want to run the packet capture on. eg Press 1 for option 1");
		  	    for(int i =0; i<=interfacechooser.size()-1; i++)
					  	    {
					  	    	 System.out.println(interfacechooser.get(i));
					  	    }
		  	    Scanner sc1 = new Scanner(System.in);
		  	    int interfaceoption = sc1.nextInt();
				if(wiresharkhome==null)
				             {
				            	  pc = new PacketCapture();
				            	  pc.setWireSharkHome();
				              }
		  	    String wiresharkpath = wiresharkhome+"/tshark -i";
		  	    String device = interfacechooser.get(interfaceoption-1);
		  	    wiresharkpath = wiresharkpath+device.substring(2);
		  	    int index = wiresharkpath.indexOf("}");
		  	    wiresharkpath = wiresharkpath.substring(0, index+1);
		  	    wiresharkpath = wiresharkpath+" -c 200";
		  	    System.out.println(wiresharkpath);
		  	    Process p = Runtime.getRuntime().exec(wiresharkpath);
		  	    InputStreamReader ir = new InputStreamReader(p.getInputStream());
				BufferedReader br = new BufferedReader(ir);
				while((line = br.readLine()) != null)
						 {   
					     System.out.println(line);
                         
						 }
				 br.close();
				 
	         }
  		   
  		   catch(Exception ex)
				  		  {
				  			    System.out.println(ex.getMessage());
				  		  }
	  	}
  	
  	public void packetAnalyzer()
		  	{    
  		        try {
				  		   System.out.println(" ");
						   System.out.println("Enter the abosolute file path to the pcap file including the filename");
						   Scanner sc2 = new Scanner(System.in);
						   String MetadataEnablercommand = sc2.nextLine();
						   File f = new File(MetadataEnablercommand);// making sure that the file is there 
							  if(f.exists())
							  {
									    if(wiresharkhome==null)
								             {
								            	  pc = new PacketCapture();
								            	  pc.setWireSharkHome();
								              }
								  	    String commandtoexecute = wiresharkhome+"/capinfos -A "+MetadataEnablercommand;
								  	    System.out.println(commandtoexecute);
								  	    Process p = Runtime.getRuntime().exec(commandtoexecute);
								  	    InputStreamReader ir = new InputStreamReader(p.getInputStream());
										BufferedReader br = new BufferedReader(ir);
										while((line = br.readLine()) != null)
												 {   
											     System.out.println(line);
						                         
												 }
										 br.close();
							  }		 
  		           }
  		         catch(Exception ex)
  		        {     System.out.println("unable to get the file ... Please recheck your filepath  and the wiresharkhome path");
  		        	  wiresharkhome = null;
  		        }


		  	}
  	
  	public void setWireSharkHome()
		  	{
			  		System.out.println("ENTER THE PATH AT WHICH TSHARK OR WIRESHARK IS INSTALLED ");
			        System.out.println(" ");
				    Scanner sc = new Scanner(System.in);
					wiresharkhome = sc.nextLine();
		  	}
}
