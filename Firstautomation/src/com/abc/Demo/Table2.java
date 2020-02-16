package com.abc.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int sum=0;
		driver.get("https://datatables.net/extensions/select/examples/initialisation/simple.html");
		List<WebElement> rows=driver.findElements(By.xpath(" //table[@id='example']/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath(" //table[@id='example']/tbody/tr[10]/td"));
		int rsize=rows.size();
		int csize=cols.size();
		System.out.println(rsize);
		System.out.println(csize);
		for(int i=1;i<=rsize;i++)
		{
			WebElement data=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]"));
			String text=data.getText();
			System.out.println(text);
			String saltext=text.replace("$", "");
			saltext=saltext.replace(",", "");
			int salint =Integer.parseInt(saltext);
			sum+=salint;
		}
	System.out.println(sum);
	
	
	
	}

}
