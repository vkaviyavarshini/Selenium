package Ques1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Q1 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup ();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get ("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		String selectItem = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		String openCart =  driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		if(openCart.equals(selectItem)) {
			System.out.println("The product is successfully added to the cart");
		}
		
		else {
			System.out.println("Sorry");
		}
		
		String checkCart = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).getText();
		System.out.println(checkCart);
		if(checkCart.equals("Continue Shopping")) {
			System.out.println("The cart is opened Successfully ");
		}
		
		else {
			System.out.println("Sorry");	
		}
		
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		String checkout = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		if(checkout.equals("Checkout: Your Information")) {
			System.out.println("The informations are displayed");	
		}
		
		else {
			System.out.println("Sorry");
		}
		
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Kaviyavarshini");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("V");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("638008");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		String prodName = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText(); 
		String prodPrice = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
		
		if(prodName.equals(openCart)) {
			System.out.println("entire product overview is displayed");
			System.out.println("Product Name:"+prodName);
			System.out.println("product price:"+prodPrice);
		}
		
		else {
			System.out.println(openCart);
			System.out.println(prodName);
		}
		
		String title = driver.getTitle();
		if(title.equals("Swag Labs")) {
			System.out.println("The Title is matched");
		}
		
		else {
			System.out.println("The Title is mismatched");
		}
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
			System.out.println("The URL is matched");
		}
		
		else {
			System.out.println("The URL is mismatched");
		}
	}
}