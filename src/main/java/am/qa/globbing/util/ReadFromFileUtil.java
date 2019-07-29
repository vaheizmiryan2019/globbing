package am.qa.globbing.util;

import java.io.FileReader;
import java.util.Properties;

public class ReadFromFileUtil {

	public static String readPropertiesByName(String name) throws Exception {
	    FileReader reader=new FileReader("src/main/resources/user.properties");  
		
	    Properties p=new Properties();  
		p.load(reader);
		
		return p.getProperty(name);
		
	}
}
