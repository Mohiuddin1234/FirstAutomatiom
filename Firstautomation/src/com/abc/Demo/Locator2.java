package com.abc.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2 {
public static void main(String []args)
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.gmail.com");
WebElement email=driver.findElement(By.cssSelector("input#identifierId"));
email.sendKeys("mohiuddin");
}
}
  