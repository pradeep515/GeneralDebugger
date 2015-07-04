package debugtool;

import java.util.Map;


public class systemProperties {
	
	
	public static Map<String, String> env = System.getenv();
	private String osname;
	private String envvariable;
	
public void printSystemProperties()
		{
	       try{
	           System.getProperties().list(System.out);
	           }catch(Exception ex) 
		       {
		        	 System.out.println(ex.getLocalizedMessage());  
		       }
			
		}

public String getOSName() 
				{ 
					  osname = System.getProperty("os.name");
					   return osname;
				}

public String getEnvValue(String name)
		    {
    	      envvariable = System.getenv(name);
    	       if(envvariable == null)
			   	    	    {
			   	    	    	 System.out.println("Not able to get the value for the environment variable");
			   	    	    }
    	       return envvariable;
		    }

public void clearScreen()
			{
	            try {
							 systemProperties sp = new systemProperties();
							 String osname1 = sp.getOSName();
							   if(osname1.contains("Win")) 
							   {   
								  // Runtime.getRuntime().exec("cls");
								   System.out.print("\033[H\033[2J"); 

			  				   }
	               } catch(Exception ex)
					            {
					            	      System.out.println(ex.getMessage() + " So not able to clear screen...better luck next time");
					            }
			}
}