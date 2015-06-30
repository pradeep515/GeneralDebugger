package debugtool;

import java.io.BufferedReader;
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
	private static String wiresharkpath;
	private static ArrayList<String> interfaceArrayList = new ArrayList<String>();
	public ArrayList<String> getInterfaceinfo(){
				try{
		
			            System.out.println("ENTER THE PATH AT WHICH TSHARK OR WIRESHARK IS INSTALLED ");
			            System.out.println(" ");
						 Scanner sc = new Scanner(System.in);
						 wiresharkpath = sc.nextLine();
						 Process p = Runtime.getRuntime().exec(wiresharkpath+"/tshark.exe -D");
						 InputStreamReader ir = new InputStreamReader(p.getInputStream());
						 BufferedReader br = new BufferedReader(ir);
						 while((line = br.readLine()) != null)
								 {   
								 interfaceArrayList.add(line);
								 }
						 br.close();
		               
			         }
				catch(Exception ex)
						{
							 System.out.println(ex.getMessage());
						}
				return interfaceArrayList;
			    
		    }
  	public void Interfacechooser(ArrayList<String> interfacechooser)
	  	{
  		  try{
	  		    System.out.println("Avaiable interface on your system are as below. Please choose whichn interace you want to run the capture on. For example enter 1 for option 1");
		  	    for(int i =0; i<=interfacechooser.size()-1; i++)
					  	    {
					  	    	 System.out.println(interfacechooser.get(i));
					  	    }
		  	    Scanner sc1 = new Scanner(System.in);
		  	    int interfaceoption = sc1.nextInt();
		  	    wiresharkpath = wiresharkpath+"/tshark -i";
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
}
