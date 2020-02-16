package com.abc.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater {

	public static void main(String[] args) {
		WebDriver d = new 	ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys("mohiuddinadamali43343@gmail.com");
		WebElement pass = d.findElement(By.className("inputtext"));
		pass.sendKeys("143m");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		WebElement link =d.findElement(By.partialLinkText("Forgot"));
		link.click();
		
		
	}

}
