package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxHomePage
{
	//1 Data member should be declared globally with access level private using @findBy Annotation
	
			@FindBy(xpath="(//a[text()='Sign In'])[1]")  WebElement signInButton;
			
			//2 Initialize within a constructor with access level public using pagefactory
			
			public NeoStoxHomePage(WebDriver driver)
			
			{
				PageFactory.initElements(driver, this);
			}
			
			//3 utilize within a method with access level public
			
			public void clickOnSignInButton()
			{
				signInButton.click();
			}

		}
	
	


