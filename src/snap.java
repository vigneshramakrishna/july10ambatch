import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snap {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashomon\\eclipse-workspace\\Snapdeal\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

driver.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,snapdeal");
driver.manage().window().maximize();
JavascriptExecutor jk=(JavascriptExecutor)driver;
WebElement product = driver.findElement(By.className("product_disc"));

jk.executeScript("arguments[0].scrollIntoView()",product);
Thread.sleep(3000);
WebElement phone = driver.findElement(By.xpath("(//div[text()='Lenovo Ideapad 330 (AMD A6 - 9225/4 GB RAM/1 TB HDD/39.62 cm (15.6 Inch)/DOS) 81D6007JIN (Onyx Black , 2.2 Kg)'])[1]"));
phone.click();
String parent = driver.getWindowHandle();
Set<String> child = driver.getWindowHandles();
for (String x : child) {
	if(!x.equals(parent)) {
		driver.switchTo().window(x);
	}		
	}
	WebElement add = driver.findElement(By.id("add-cart-button-id"));
	add.click();
}
//Actions acc=new Actions(driver);
//acc.moveToElement(phone);
//acc.click().build().perform();

//mouse.moveToElement(phone);
}
	 