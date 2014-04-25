package fr.mines_nantes.atlanmod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigurations {
	
	private static Properties prop = new Properties();
	private static InputStream input = null;
	
	public static String getPropertyValue(String key) throws IOException {
		input = new FileInputStream("monitoring.properties");
		prop.load(input);
		return prop.getProperty(key);
	}
}
