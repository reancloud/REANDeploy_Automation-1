package com.opex.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.openqa.selenium.OutputType;



public class FileUtils {
	public static InputStream readFileFromClassPath(String file) {
		InputStream is = FileUtils.class.getClassLoader().getResourceAsStream(file);
		return is;
	}

	public static void close(InputStream is) {
		if(is != null){
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static InputStream readFile(String filePath) throws FileNotFoundException {
		InputStream is = new FileInputStream(new File(filePath));
		return is;
	}

	/*public static void copyFiles(File scrFile, File file, org.openqa.selenium.TakesScreenshot driver) {
		File scrFile1 = ((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File scrFile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFiles(scrFile1, new File("/DeployNowAutomation/Screenshots/save_screenshot.png"));
		
		
	}
*/
	
}
