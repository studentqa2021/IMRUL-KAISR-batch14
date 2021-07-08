package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;

//last advanced selenium


public class AutomationPractice {


public void autoget() {
	
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
    //driver.navigate().to("http://automationpractice.com/index.php");

    driver.navigate().to(BaseConfig.getconfigvalue("Url"));
    //this is old code
	driver.manage().window().maximize();
	//WebElement signinbtn=driver.findElement(By.xpath("//*[@class='login']"));//advanced color
     //signinbtn.click();	
     //this is new code
     MasterpageFactory obj=new MasterpageFactory(driver);
    // obj.getSigninbtn().click();
    // Highlighter.addcolor(obj.getSigninbtn(),driver);
     obj.getSigninbtn().click();
     
	obj.getEmail().sendKeys("sarowerny@gmail.com");
    // Highlighter.addcolor(obj.getEmail(),driver);
	//obj.getEmail().sendKeys( BaseConfig.getconfigvalue("User"));
	
	obj.getPassword().sendKeys("student");
	//Highlighter.addcolor(obj.getPassword(),driver);
	// obj.getPassword().sendKeys(BaseConfig.getconfigvalue("Password"));
	obj.getLastsigninbtn().click();
}
}