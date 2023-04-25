package com.PracSel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	public static void main(String[]args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb/");
		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.sendKeys("asAS");
		WebElement lname = driver.findElement(By.id("input-lastname"));
		lname.sendKeys("zxZX");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("aszx@gmail.com");
		WebElement pwd = driver.findElement(By.id("input-password"));
		pwd.sendKeys("1234");
		JavascriptExecutor jsEx = (JavascriptExecutor)driver;
		jsEx.executeScript("window.scrollBy(0,500)","");
		WebElement noButton = driver.findElement(By.id("input-newsletter-no"));
		noButton.click();
		
	}
}

