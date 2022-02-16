package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailLogin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	driver.close();
}
}
