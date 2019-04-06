package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
public static WebDriver driver;
@Before
public static void launchBrowser()
{
	System.out.println("Executing Launch Browser");
}
@After
public static void quitbrowser()
{
	System.out.println("Executing quit browser");
	driver.close();
	driver.quit();
}

}
