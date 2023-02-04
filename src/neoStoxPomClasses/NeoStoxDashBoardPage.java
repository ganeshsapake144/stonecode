package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxDashBoardPage 
{
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement popUpokButton;
	
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement popUpCloseButton;
	
	@FindBy(id="lbl_username")private WebElement userName;
	
	@FindBy(xpath="//span[text()='Logout']")private WebElement logOutButton;
	
	
	public NeoStoxDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void handlePopUp() throws InterruptedException
	{
		Thread.sleep(500);
		popUpokButton.click();
		Thread.sleep(500);
		popUpCloseButton.click();
		
		
	}
	
	public void validateUserName()
	{
		String expectedUserName="Hi ganesh sapkale";
		
		String actualUserName=userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("TC is passed,actual and expected user names are matching");
			
		}
		else {
			System.out.println("TC is failed,actual and expected user names are not matching");
			
		}
		
	}
	public void logOutFromNeoStox() throws InterruptedException
	{
		userName.click();
		Thread.sleep(1000);
		
		logOutButton.click();
		
		
	}

}
