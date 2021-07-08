package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
public static void getscreenshot(WebDriver driver,String ScreenshotName){

	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
    try {
		FileUtils.copyFile(scrFile, new File("./ScreenShot/"+ScreenshotName+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}