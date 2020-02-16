package com.abc.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mohiuddin/Desktop/HTML%20files/3.html");
		WebElement wb=driver.findElement(By.xpath("td[text()='Manaul Testing'"));
		wb.sendKeys(" Automation");
	}

}
