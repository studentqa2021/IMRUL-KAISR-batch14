 package com.smoke;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.NyLogin;
// import com.generic.NyLogin;
 public class SmokeTesting {
	 //public static String smoke1() {
 //open chrome browser(class+method+(package+value)
 //(1st line cap letter SP D)(2nd line cap WD CD
 //System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
  //WebDriver driver = new ChromeDriver();
 //driver.get("https://www.google.com/");
 
 //web page
 // driver.get("http://automationpractice.com/index.php");
 //driver.navigate().to("http://automationpractice.com/index.php\");");
// return "name"; 
  
 
 	
	public static void main(String[] args) {
	//NyLogin obj=new NyLogin();
    // obj.ctLogin();//95%(basic) use this use this
	//or
	//
		//-5%-(advanced java)
	new NyLogin().ctLogin();    
   // NyLogin	 obj=new NyLogin();
			//obj= new NyLogin();
	//new NyLogin().ctaPayment();//this is for interface class
	//SmokeTesting.smoke1();//this for same class
	
	}

	private static NyLogin NyLogin() {
		// TODO Auto-generated method stub
		return null;
	}	
	}
 
