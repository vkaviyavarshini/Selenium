package com.PracSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		String url1=driver.getCurrentUrl();
		if(url1.equals("https://j2store.net/free/"))
		{
			System.out.println("url validated");
		}
		WebElement clothing=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		clothing.click();
		url1=driver.getCurrentUrl();
		if(url1.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println("url validated");
		}

	}
}
