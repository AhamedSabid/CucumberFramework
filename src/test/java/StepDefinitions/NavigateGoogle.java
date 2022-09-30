package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateGoogle {

	WebDriver driver;

	@Given("^Navigate to url \"([^\"]*)\"$")
	public void navigate_to_url(String url){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Given("^Enter the serach text \"([^\"]*)\"$")
	public void enter_the_serach_text(String software) throws Throwable {

		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(software);
		Thread.sleep(3000);

	}

	@When("^Verify the logo$")
	public void verify_the_logo() throws IOException{
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Google']"));
		logo.click();
		File file = logo.getScreenshotAs(OutputType.FILE);
		File destFile = new File("logoFileGoogle.png");
		FileUtils.copyFile(file, destFile);
	}

	@When("^Close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

}
