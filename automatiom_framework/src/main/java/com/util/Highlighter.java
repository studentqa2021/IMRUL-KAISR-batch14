package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
 public static void addcolor(WebElement element,WebDriver driver){
	JavascriptExecutor obj = (JavascriptExecutor)driver; 
	obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",element
,"color: white; border: 2px solid red;");
}
}
