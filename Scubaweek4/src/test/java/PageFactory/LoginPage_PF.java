package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.library.BrowserFactory;
import com.tests.pages.LoginPage1;

public class LoginPage_PF {
	@Test
	public void TestValidLogin()
	{
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://opensource-demo.orangehrmlive.com");
		LoginPage1 login_page=PageFactory.initElements(driver, LoginPage1.class);
		login_page.LoginHRM_new("Admin","admin123");
		driver.quit();
	}

}
