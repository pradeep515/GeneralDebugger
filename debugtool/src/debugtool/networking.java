package debugtool;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class networking {
  private String osname;
  private String line;
  
  public void netstatRunner() 
  {
	      try
		       {
					  systemProperties  sp = new systemProperties();
					  osname = sp.getOSName();
					  System.out.println(osname);
					  if(osname.contains("Win"))
							  {
								  Process p = Runtime.getRuntime().exec("netstat -naot");
								  InputStreamReader ir = new InputStreamReader(p.getInputStream());
								  BufferedReader br = new BufferedReader(ir);
									while((line = br.readLine()) != null)
											 {   System.out.println(line);
						                     }
									 br.close();
							  }
					  else 
							  {
								  System.out.println("Yet to be implemented for linux");
							  }
		    	  
		        }catch(Exception ex)
				      {
				        ex.printStackTrace(); 	  
				      }
	}
}