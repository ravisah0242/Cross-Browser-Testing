package com.pages.crossBrowser;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.crossBrowser.AutoConstants;
import com.generics.crossBrowser.ExcelLibrary;

public class ActitimeLoginPage  implements AutoConstants
{	
	public WebDriver dtiver;
	//declaration
	
			/*@FindBy(id="username")
			private WebElement usernameTextfield;*/
			
			@FindBy(xpath="//input[@name='username']")
			private WebElement usernameTextfield;
			
			@FindBy(xpath="//input[@name='pwd']")
			private WebElement passwordTextfield;
			
			@FindBy(id="keepLoggedInCheckBox")
			private WebElement keepmeloggedinCheckbox;
			
			@FindBy(id="loginButton")
			private WebElement loginButton;
			
			public ActitimeLoginPage(WebDriver driver) 
			{
				PageFactory.initElements(driver, this);
			}
			
			public void loginMethod() throws IOException
			{
				usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 5, 2));
				passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 5, 3));
				keepmeloggedinCheckbox.click();
				loginButton.click();
			}

}
