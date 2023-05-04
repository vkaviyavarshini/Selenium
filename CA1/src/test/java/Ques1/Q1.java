package Ques1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1 {
	
     public static void main(String[] args) throws  InterruptedException 
     {
    	  WebDriverManager.chromedriver().setup ();
    	  WebDriver driver;
  		  ChromeOptions co=new ChromeOptions();
  		  co.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.amazon.in/OnePlus-Bluetooth-Wireless-Co-Created-Cancellation/dp/B0BRSLJCY2/ref=sr_1_1_sspa?keywords=oneplus+buds&qid=1683195173&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		  WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		  addtocart.click();
		  Thread.sleep(2000);
		  WebElement cart=driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
		  cart.click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("a-autoid-0-announce")).click();
		  driver.findElement(By.xpath("//*[@id=\"quantity_4\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
			
		  Thread.sleep(2000);
          WebElement Buy=driver.findElement(By.name("proceedToRetailCheckout"));
		  Buy.click();
		  
     }
}