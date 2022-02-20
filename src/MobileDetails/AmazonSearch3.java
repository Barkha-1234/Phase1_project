package MobileDetails;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");    
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Iphone12");
		
		WebElement click=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		click.click();
		
		//List<WebElement> result=driver.findElement(By.xpath(null))
		
		List<WebElement> phone=driver.findElements(By.xpath("//*[@id=\"search\"]//h2/a/span"));
		for (WebElement elm:phone)
		{
			System.out.println(elm.getText());
			
	
		}
		List<WebElement> price=driver.findElements(By.xpath("//*[@id='search']//span/span[2]/span[2]"));
		for (WebElement elm:price)
		{
			System.out.println(elm.getText());
			
		}
	}

}
