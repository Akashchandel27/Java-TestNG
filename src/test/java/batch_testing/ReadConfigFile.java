package batch_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties Properties;
	String path = "C:\\Users\\akash.chandel\\eclipse-workspace\\codestudio\\src\\test\\java\\batch_testing\\Config.properties";
	
	public ReadConfigFile() {
		
		Properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				try {
					Properties.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}

		
