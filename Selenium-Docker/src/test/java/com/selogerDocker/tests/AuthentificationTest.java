package com.selogerDocker.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selogerDocker.pages.AuthentificationPage;

public class AuthentificationTest{

    private WebDriver driver;
    private AuthentificationPage connexion;
   
    @BeforeTest
    public void setUp() throws MalformedURLException {
    	
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.setCapability("name", "Authentification");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
        connexion = new AuthentificationPage(driver);
        
    }
  
    @Test
    public void authentifierSLG() throws InterruptedException {
    	
    	
    	connexion.goTo();
    	Thread.sleep(3000);
    	
    	connexion.goPageConnexion();
    	Thread.sleep(2000);
    	
    	connexion.saisirLoginMP();
    	Thread.sleep(2000);
    	
    	connexion.connecterSLG();
    	Thread.sleep(3000);
    }
 
    @AfterTest
    public void tearDown() throws InterruptedException {
        driver.quit();
    }    

}
