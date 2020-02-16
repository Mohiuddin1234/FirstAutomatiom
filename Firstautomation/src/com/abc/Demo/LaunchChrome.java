package com.abc.Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenuim softwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}

}
