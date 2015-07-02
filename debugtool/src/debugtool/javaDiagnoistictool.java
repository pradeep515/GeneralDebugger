package debugtool;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author pkaliset
 * 
 * The class javaDiagnoistictool takes care of all the funtions of java based tools like ablity to take heap dumps,
 * listing out all the java process, analysing the heap dump etc
 */

public class javaDiagnoistictool {
	
	ReadEnvVariable rv = new ReadEnvVariable();
	private String JAVA_HOME = rv.getEnvValue("JAVA_HOME");
	public String line;
	
	/**
	 * getRunningJavaProcessids() would check for all the running java processes on the system that it is run and lists them .
	 */
	public void getRunningJavaProcessids()
	{
			try{	    
				         String cmd = JAVA_HOME + "/bin/jps";
						 Process p = Runtime.getRuntime().exec(cmd);
						 InputStreamReader ir = new InputStreamReader(p.getInputStream());
						 BufferedReader br = new BufferedReader(ir);
						 while((line = br.readLine())!= null)
								 {
									System.out.println(line); 
								 }
	           } catch(Exception ex)
					            {
			        	               System.out.println(ex.getMessage());
			                    }
    }
	
	
}