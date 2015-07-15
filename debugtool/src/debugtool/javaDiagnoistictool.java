package debugtool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
	protected static ArrayList<String> JavaProcessArrayList ;
    public static int processcounter;
    systemProperties sp = new systemProperties();
    String osname = sp.toString();
	/**
	 * getRunningJavaProcessids() would check for all the running java processes on the system that it is run and lists them .
	 */
	public ArrayList<String> getRunningJavaProcessids()
	{
		JavaProcessArrayList = new ArrayList<String>();
			try{	    
				         String cmd = JAVA_HOME + "/bin/jps -q";
						 Process p = Runtime.getRuntime().exec(cmd);
						 InputStreamReader ir = new InputStreamReader(p.getInputStream());
						 BufferedReader br = new BufferedReader(ir);
						 processcounter =0;
						 while((line = br.readLine())!= null)
								 {   String processid = line;
							         processcounter = processcounter+1;
                                     JavaProcessArrayList.add(line);
                                     System.out.println(processcounter+") "+line);
								 }
	           } catch(Exception ex)
					            {
			        	               System.out.println("Please check if you java home is given properly ");
			                    }
			return JavaProcessArrayList;
    }
	
	public void getthreaddump(int processid, ArrayList<String> JavaProcidList)
	{
		  int procid = processid;
		   if(JavaProcidList.size()>0)
		   {      try{
					    String commandtoexecute = JAVA_HOME + "/bin/jmap -dump:file=heap.bin "+JavaProcidList.get(procid-1);
				  	    System.out.println(commandtoexecute);
				  	    Process p = Runtime.getRuntime().exec(commandtoexecute);
				  	    InputStreamReader ir = new InputStreamReader(p.getInputStream());
						BufferedReader br = new BufferedReader(ir);
						while((line = br.readLine()) != null)
								 {   
										System.out.println(line);
			                  
								 }
						 br.close();
		             }catch(Exception ex) 
								 {
									  System.out.println(ex.getMessage()+ "  NOT ABLE TO TAKE THREAD DUMP. PLEASE MAKE SURE THAT YOU HAVE PERMISSIONS TO WRITE TO THE FOLDER") ;            	  
								 }
		   }
	}
	
	public void analysethreaddump()
	{
		
	}
	
	
}