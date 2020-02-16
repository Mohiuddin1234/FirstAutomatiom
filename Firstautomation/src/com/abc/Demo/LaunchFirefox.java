package com.abc.Demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\selenuim softwares\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

	}

}
