package debugtool;

import java.io.InputStream;



public class networking {

	
	public void netstatRunner()  {
      try{
			String[] cmdarray = { "netstat", "-an" };
		    Process process = Runtime.getRuntime().exec(cmdarray);
		     InputStream ir = process.getInputStream();
		     java.util.Scanner s = new java.util.Scanner(ir).useDelimiter("\\A");
		     System.out.print(s.hasNext() ? s.next() : "");
          }catch(Exception ex)
		      {
		        ex.printStackTrace(); 	  
		      }
	}
}