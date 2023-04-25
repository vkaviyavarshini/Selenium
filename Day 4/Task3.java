package com.PracSel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        WebElement fname = driver.findElement(By.xpath("//*[@id='input-to-name']"));
        fname.sendKeys("Kaviya");
        WebElement lname = driver.findElement(By.xpath("//*[@id='input-from-name']"));
        lname.sendKeys("Venkat");
        WebElement email = driver.findElement(By.xpath("//*[@id='input-to-email']"));
        email.sendKeys("kaviya003@gmail.com");
        WebElement e_mail = driver.findElement(By.xpath("//*[@id='input-from-email']"));
        e_mail.sendKeys("venkat@gmail.com");
        WebElement button = driver.findElement(By.xpath("//*[@id='input-to-name']"));
        button.click();
        JavascriptExecutor jsEx = (JavascriptExecutor)driver;
        jsEx.executeScript("window.scrollBy(0,250)","");
        Thread.sleep(3000);
        WebElement message = driver.findElement(By.xpath("//*[@id='input-message']"));
        message.sendKeys("Hello Everyone!!");
        WebElement amount = driver.findElement(By.xpath("//*[@id='input-amount']"));
        amount.sendKeys("1");
        WebElement button1 = driver.findElement(By.xpath("//*[@id='form-voucher']/div[8]/div/div/input"));
        button1.click();
	}
	
}
