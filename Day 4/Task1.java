package com.PracSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1{
	public static void main(String[]args) {
		
	  //WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\tharu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(co);
	  driver.get("https://www.google.com");
	}

}
