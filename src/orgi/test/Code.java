package orgi.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashomon\\eclipse-workspace\\Day11\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
	WebElement src=driver.findElement(By.xpath("(//li[@class='block14 ui-draggable'])"));
	WebElement dest=driver.findElement(By.id("bank"));
	Actions acc=new Actions(driver);

	acc.dragAndDrop(src,dest).perform();

	WebElement src1=driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[2]"));
	WebElement dest1=driver.findElement(By.id("amt7"));
	acc.dragAndDrop(src1, dest1).perform();
	}
}
