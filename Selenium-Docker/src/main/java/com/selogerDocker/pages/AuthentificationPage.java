package com.selogerDocker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthentificationPage { 
	

	private final WebDriver driver;
	private final WebDriverWait wait;

	@FindBy(linkText = "Connexion")
	private WebElement btnConnexionHaut;

	@FindBy(id = "Identifiant")
	private WebElement fieldEmail;

	@FindBy(id = "MotDePasse")
	private WebElement fieldMP;

	@FindBy(className = "tagClick")
	private WebElement btnConnexionBas;

	public AuthentificationPage(final WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, 30);
	}

	public void goTo() {
		this.driver.get("https://rct-selogervacances.poliris.net/");
	}
	
	
	public void goPageConnexion () throws InterruptedException {
	
		this.btnConnexionHaut.click();
		
	}
	
	public void saisirLoginMP() throws InterruptedException {
		
		this.fieldEmail.sendKeys("zied.seloger.03@gmail.com");
		this.fieldMP.sendKeys("123456zied");
		
	}

	public void connecterSLG() throws InterruptedException  {
		
		this.btnConnexionBas.click();
	}
}
