package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Demo {
	 
	@Test(groups="smoke")
	public void demo1()
	{
		WebDriver d= new ChromeDriver();
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		d.get("http://localhost:8888/");
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		d.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("SMOKE TEST");
	}
	
	
	
	@Test(groups="regression")
	public void demo2()
	{
		WebDriver d= new ChromeDriver();
		d.get("http://localhost:8888/");
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		d.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("REGRESSION TEST");
	}
	
	

}
