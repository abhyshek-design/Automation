import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdScenario {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//a[@title='Printed Summer Dress']//following::a[Text()='More']"));
		
		driver.findElement(By.className("icon-plus"));
		
		Select size= new Select(driver.findElement(By.id("group_1")));
		
		size.selectByIndex(1);
		
		driver.findElement(By.xpath("//a[Text='Add to cart']"));
		
		driver.switchTo().frame(1);
		Assert.assertEquals(driver.findElement(By.tagName("Product")),"Product successfully added to your shopping cart");
	
		System.out.print("Test Passed");
	}

}
