package Zz_Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	Properties properties;

	public PropertyFileReader() {

		try {
			
			String projectPath = System.getProperty("user.dir"); //Fetching the Project Path
			String pathPropertyFile = projectPath + File.separator + "configs" + File.separator + "config.properties";


			File file = new File(pathPropertyFile);
			FileInputStream fis = new FileInputStream(file);
			properties = new Properties();
			properties.load(fis);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}

	public String getChromeDriverPath() {
		String chromeDriverPath = properties.getProperty("ChromeDriverPath");
		return chromeDriverPath;
	}

	public String getApplicationURL() {
		String applicationURL = properties.getProperty("URL");
		return applicationURL;
	}
}
