package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Gopinath");
		driver.findElement(By.id("lastNameField")).sendKeys("Surendhran");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Gopi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software");
		driver.findElement(By.name("description")).sendKeys("all the best");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gopin913@gmail.com");
		WebElement country = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select text=new Select(country);
		text.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("All the Best");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	}

}
