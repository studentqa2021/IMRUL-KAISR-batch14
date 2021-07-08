package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;

public class UsaLoginNewPractice2 {
	
	public void getlogin2() {
		
		
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
  
   JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting+ basic way color
   WebElement signinbtn= driver.findElement(By.xpath("//*[@class='login']"));
   obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",signinbtn, "color: red; border: 2px solid red;");
   
 // Highlighter.addcolor(signinbtn, driver);
     signinbtn.click();
      //below this two code not working
      WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
       // JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting+ basic way color
      obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",email, "color: yellow; border: 2px solid white;");
      	/// Highlighter.addcolor(email, driver);
         email.sendKeys("sarowerny@gmail.com");
         
         WebElement password= driver.findElement(By.xpath("//*[@id='passwd']"));
         //JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting+ basic way color
         obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",password, "color: white; border: 2px solid green;");
         	// Highlighter.addcolor(password, driver);
            password.sendKeys("student");
      	}
   	
	}
	


