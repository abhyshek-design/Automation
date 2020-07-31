import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FourthScenario {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']"));
		
		driver.findElement(By.id("email")).sendKeys("ABC");
		driver.findElement(By.id("passwd")).sendKeys("pass");
		driver.findElement(By.id("passwd")).submit();
		
		Assert.assertEquals(driver.findElement(By.className("alert alert-danger")).getText(),"Invalid email address.");
		
		System.out.print("Test Passed");
}
}