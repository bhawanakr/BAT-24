package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	String path="config.properties";
	//default constructor
	
	public ReadConfig() throws Exception {
		
		properties=new Properties();
		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
	}
	
	
	//user difined method
	public String getBrowser() {
		String value=properties.getProperty("browser");//chrome
		
		if(value!=null) {
			return value;//chrome
		}
		else {
			throw new RuntimeException("Browser is not found in config file");
		}
	}
	

}
