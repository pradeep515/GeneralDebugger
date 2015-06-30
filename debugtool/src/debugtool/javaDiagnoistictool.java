package debugtool;

import java.lang.management.ManagementFactory;

public class javaDiagnoistictool {
	
	public void javaTools()
	{
		String name = ManagementFactory.getRuntimeMXBean().getName();
		System.out.println(name);
		int index = name.indexOf("@");
		String name1 = name.substring(0, index);
		System.out.println("This is the process id " + name1);
	}

}
