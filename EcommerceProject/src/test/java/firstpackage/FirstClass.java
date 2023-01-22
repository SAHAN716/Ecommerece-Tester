package firstpackage;


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args)throws InterruptedException{
        WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String actualtitle=driver.getTitle();
		String expectedtitle= "Swag Labs";
		Assert.assertEquals(actualtitle,expectedtitle);
		System.out.println(actualtitle);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		WebElement loginbutton= driver.findElement(By.xpath("//input[@id='login-button']"));
		assert loginbutton.isEnabled();
		System.out.println(true);
		assert loginbutton.isDisplayed();
		System.out.println(true);
		loginbutton.click();
		Thread.sleep(3000);
		
		WebElement cartbutton= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		assert cartbutton.isDisplayed();
		System.out.println(true);
		assert cartbutton.isEnabled();
		System.out.println(true);
		cartbutton.click();
		Thread.sleep(3000);
		
		WebElement shoppingbutton= driver.findElement(By.className("shopping_cart_link"));
		assert shoppingbutton.isDisplayed();
		System.out.println(true);
		assert shoppingbutton.isEnabled();
		System.out.println(true);
		shoppingbutton.click();
		Thread.sleep(5000);
		
		WebElement checkbutton= driver.findElement(By.id("checkout"));
		assert checkbutton.isDisplayed();
		System.out.println(true);
		assert checkbutton.isEnabled();
		System.out.println(true);
		checkbutton.click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("first-name")).sendKeys("Samiul Sahan");
		driver.findElement(By.id("last-name")).sendKeys("12345");
		driver.findElement(By.id("postal-code")).sendKeys("1212");
		Thread.sleep(3000);
		
		WebElement continuebutton= driver.findElement(By.id("continue"));
		assert continuebutton.isDisplayed();
		System.out.println(true);
		assert continuebutton.isEnabled();
		System.out.println(true);
		continuebutton.click();
		Thread.sleep(3000);
		
		WebElement finishbutton= driver.findElement(By.id("finish"));
		assert finishbutton.isDisplayed();
		System.out.println(true);
		assert finishbutton.isEnabled();
		System.out.println(true);
		finishbutton.click();
		Thread.sleep(3000);
		
		//driver.close();

	}

}
