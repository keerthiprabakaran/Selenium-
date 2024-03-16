package org.Create;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class fbLogin extends BaseClass1 { 
		//1. NonParameterized Constructor

		public fbLogin() {
			PageFactory.initElements(driver, this);
		}
		//2.Private WebElements
		//WebElement email = driver.findElement(By.id("email"));
		
		@FindAll({
			@FindBy(xpath = "//input[@id='email']"),
			@FindBy(xpath = "//input[@name='email']"),
			@FindBy(xpath = "//input[@data-testid='royal_email']")
			
		})

		private WebElement VarRef;

		@FindBy(xpath = "//input[@aria-label='Password']")
		private WebElement pwd;

		@FindBy(name = "login")
		private WebElement logBtn;

		
		
		//3.Getter to Access webElements outside the class
		public WebElement getVarRef() {
			return VarRef;
		}

		public WebElement getPwd() {
			return pwd;
		}

		public WebElement getLogBtn() {
			return logBtn;
		}
		

		
		
		
		

	}