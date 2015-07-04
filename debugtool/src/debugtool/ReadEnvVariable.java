package debugtool;

import java.util.Map;


public class ReadEnvVariable {
	
	public static Map<String, String> env = System.getenv();
    private String envvariable;
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
	
			    
