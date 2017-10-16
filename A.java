package a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) throws Exception {
		
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
    	
		driver.get("https://www.gmail.com");
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
		
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("ujjwalkumarvivek2009@gmail.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		System.out.println(driver.getTitle());

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("06154226246");
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\":iw\"]/div/div[2]/span/a")).click();
		String Tittle1 = driver.getTitle();
		System.out.println(Tittle1);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\":ix\"]/div/div[2]/span/a")).click();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\":iy\"]/div/div[2]/span/a")).click();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("::.//*[@id=':ip']/div/div[2]/span/a")).click();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id=':ir']/div/div[2]/span/a")).click();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id=':is']/div/div[2]/span/a")).click();
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id=':is']/div/div[2]/span/a")).click();
		System.out.println(driver.getTitle());



	}

}
