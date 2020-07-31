import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScenario {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dress");
		driver.findElement(By.xpath("//input[@id='search_query_top']")).submit();
		List<WebElement> searchedProducts= driver.findElements(By.xpath("//a[@class='product-name']"));
		for(WebElement a: searchedProducts)
		{
			Assert.assertEquals(a.getText(),"dress");
		}
		System.out.print("Test Passed");
		driver.close();
		
	}

}
