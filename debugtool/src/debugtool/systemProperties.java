package debugtool;


public class systemProperties {
	
public void printSystemProperties()
		{
	       try{
	           System.getProperties().list(System.out);
	           }catch(Exception ex) 
		       {
		        	 System.out.println(ex.getLocalizedMessage());  
		       }
			
		}

}