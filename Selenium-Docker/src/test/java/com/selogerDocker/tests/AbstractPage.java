package com.selogerDocker.tests;

import org.openqa.selenium.WebDriver;


public abstract class AbstractPage {
	
	public static WebDriver driver;
	public static boolean bResult;

	public  AbstractPage(WebDriver driver){
		AbstractPage.driver = driver;
		AbstractPage.bResult = true; 
	}
	
}
