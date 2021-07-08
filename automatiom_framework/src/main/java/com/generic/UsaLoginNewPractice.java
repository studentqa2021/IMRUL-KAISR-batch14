package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;
import com.util.ScreenShot;



	public class UsaLoginNewPractice implements NewBaseLogin {
		
		
		

		@override
		public void ctLogin(){
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		     

		     // driver.get("http://automationpractice.com/index.php");
		      driver.navigate().to("http://automationpractice.com/index.php");
		      ScreenShot.getscreenshot(driver, "Homepage");
		      //File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
			   // try {
					//FileUtils.copyFile(scrFile, new File("./ScreenShot/Homepage"));
				//} catch (IOException e) {
				//	// TODO Auto-generated catch block
				//	e.printStackTrace();
				//}
				
			driver.manage().window().maximize();
			//driver.findElement(By.className("login")).click();
			
WebElement signinbtn=driver.findElement(By.xpath("//*[@class='login']"));//advanced color
Highlighter.addcolor(signinbtn, driver);

///try {
	//FileUtils.copyFile(scrFile, new File("./ScreenShot/beforeLoginClick"));
///} catch (IOException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
//}
ScreenShot.getscreenshot(driver,"beforeclick");
signinbtn.click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
ScreenShot.getscreenshot(driver,"afterclick");
///try {
	//FileUtils.copyFile(scrFile, new File("./ScreenShot/afterLoginClick"));
//} catch (IOException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
//}
	//JavascriptExecutor obj = (JavascriptExecutor)driver; 
	//obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	//driver.findElement(By.xpath("//*[@class='login']" )),"color: white; border: 2px solid red;");
	//driver.findElement(By.xpath("//*[@class='login']")).click();
WebElement email=driver.findElement(By.xpath("//*[@id='email']"));//advanced color
Highlighter.addcolor(email, driver);
 email.sendKeys("sarowerny@gmail.com");		
	//obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	 //driver.findElement(By.xpath("//*[@id='email']" )),"color: yellow; border: 2px solid green;");
	//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
WebElement password=driver.findElement(By.xpath("//*[@id='passwd']"));//advanced color
Highlighter.addcolor(password, driver);
password.sendKeys("student");
	
	//obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	//driver.findElement(By.xpath("//*[@id='passwd']" )),"color: blue; border: 2px solid pink;");
	 //driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");
WebElement lastsigninbtn=driver.findElement(By.xpath("//*[@class='icon-lock left']"));//advanced color
Highlighter.addcolor(lastsigninbtn, driver);
lastsigninbtn.click();
	driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	//driver.close();
		}

	

		//@Override
		//public void ctaPayment() {
			// TODO Auto-generated method stub
			
		}

		
			
		
		//inherritence+poly(override)
	
				
			
				
			
				
		
			


