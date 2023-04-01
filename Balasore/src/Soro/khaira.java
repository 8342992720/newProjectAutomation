package Soro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class khaira {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://webapp.qedgetech.com");
	
	driver.findElement(By.id("username"));
	driver.findElement(By.xpath("//input[@id='password']"));
	driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
	
	Select st=new Select(driver.findElement(By.xpath("(//b[@class='caret'])[1]")));
	st.selectByIndex(1);
	
	driver.close();
	

}
}
