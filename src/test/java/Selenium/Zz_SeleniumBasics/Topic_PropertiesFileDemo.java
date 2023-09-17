package Selenium.Zz_SeleniumBasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Topic_PropertiesFileDemo {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir"); //Fetching the Project Path

	public static void main(String[] args) throws IOException {
		setProperties("Browser", "Firefox");
		getProperties("Browser");
		setProperties("Browser", "Chrome");
		getProperties("Browser");
		setProperties("Application", "Facebook");
	}

	public static void getProperties(String propertyName) {

		try {
			FileInputStream fis = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			prop.load(fis);
			String propertyValue = prop.getProperty(propertyName);
			System.out.println("Value of Property '"+propertyName+"' is: "+propertyValue);
			Topic_PropertiesFile_Log4j_TestNG_ExtentReport.browsername = propertyValue;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void setProperties(String propertyName, String propertyValue) {

		try {
			FileOutputStream fos = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			System.out.println("Setting the Property '"+propertyName+"' with value: "+propertyValue);
			prop.setProperty(propertyName, propertyValue);
			prop.store(fos, null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
