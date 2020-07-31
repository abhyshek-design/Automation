import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondScenario {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//a[@title='Printed Summer Dress']//following::a"));

		driver.switchTo().frame(1);
		Assert.assertEquals(driver.findElement(By.tagName("Product")),"Product successfully added to your shopping cart");
	
		System.out.print("Test Passed");
	}

}
