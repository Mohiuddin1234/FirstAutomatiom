package com.abc.Demo;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser");
		String b= sc.next();
		if(b.equalsIgnoreCase("firefox"))
		{
			FirefoxDriver f = new FirefoxDriver();
			Test(f);
		}
		else
		{
			ChromeDriver c = new ChromeDriver();
			Test(c);
		}
	}

	private static void Test(WebDriver driver) {
		driver.get("https://www.gmail.com");
		String actual=driver.getTitle();
		System.out.println(actual);
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		driver.close();
	}
	
}
