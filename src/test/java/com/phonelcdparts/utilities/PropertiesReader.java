package com.phonelcdparts.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	Properties prop;
	
	public PropertiesReader() {
		prop = new Properties();
		String propertiesFlile="src/test/resources/test.properties";

		try (FileInputStream fis = new FileInputStream(propertiesFlile)) {
			prop.load(fis);
			
		} catch (IOException e) {
			

			e.printStackTrace();
		}
	}
	public String readBrowser() {
		return prop.getProperty("browser");
		
	}
	public String getqaUrl() {
		return prop.getProperty("qaUrl");
		
		
	}
	public String getUserName() {
		return prop.getProperty("userName");
		
	}
	public String getPassword() {
		return prop.getProperty("passWord");
		
	}

	
	
	
	

}
