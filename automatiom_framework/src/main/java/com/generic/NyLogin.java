package com.generic;



//import com.util.Highlighter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;

//import com.util.Highlighter;

public  class NyLogin implements BaseLogin{
	
//inherritence+poly(override)
	//private WebElement element;

	@Override
	public void ctLogin() { 
		
		//how to open a browser in google then click on stack overflow
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	     // driver.get("http://automationpractice.com/index.php");
	     // driver.navigate().refresh();//refresh page
	     // driver.navigate().forward();//next page
	     // driver.navigate().back();//previous page
	     driver.get("http://automationpractice.com/index.php");
	      //driver.manage().window().maximize();//max size
	      // driver.manage().window().fullscreen();full size
	     
	      //signin button
	      WebElement signinbtn =driver.findElement(By.xpath("//*[@class='login']"));
	      Highlighter.addcolor( signinbtn, driver);
	      signinbtn.click();
	      //sign in color
	      JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting

	      obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@class='login']")), "color: red; border: 2px solid red;");
	      
	      
	      //driver.findElement(By.className("login")).click();
	    // ']")).click();
	     //xpath
	     //obj.driver.findElement(By.xpath("//*[@class='loginexecuteScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@id='email']")), "color: red; border: 2px solid red;");
	     


	    // obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	     
	    // driver.findElement(By.xpath("//*[@id='passwd']")), "color: red; border: 2px solid red;");
	    // driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("kaiserimrul78@gmail.com");
	     
	     WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
	     Highlighter.addcolor( email, driver);
	     email.sendKeys("sarowerny@gmail.com");
	     
	    //driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("4321");
	     
	    // WebElement password=driver.findElement(By.xpath("//*[@id='passwd']"));
	     //Highlighter.addcolor( password, driver);
	     //password.sendKeys("student");
	     
	    //obj.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(By.xpath("//*[@class='icon-lock left']")), "color: red; border: 2px solid red;");
	     WebElement lastsigninbtn=driver.findElement(By.xpath("//*[@class='icon-lock left']"));
	     Highlighter.addcolor( lastsigninbtn, driver);
	     lastsigninbtn.click();
	     
	    //driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
		//driver.close();   
	    //driver.quit();  
	}
		// TODO Auto-generated method stub
		//inheritance+polymorphism

@Override
public void ctaPayment() {
	// TODO Auto-generated method stub
	
}

//@Override
//public void ctaPayment() {
	// TODO Auto-generated method stub
	
}


	//public void ctaPayment() {
		// TODO Auto-generated method stub
		
	//}

	
	
		//System.out.println("ctaPayment");
//}
//}

