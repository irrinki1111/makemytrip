package github.github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class github1 extends base_class{

	@Test
	public void from() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='landingContainer']/parent::div")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("chennai");
		
		driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void to() throws InterruptedException {
	
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("delhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		Thread.sleep(3000);
		
	}	

}