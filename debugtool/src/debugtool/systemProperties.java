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
}