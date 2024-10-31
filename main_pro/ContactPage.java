package main_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactPage  {
	WebDriver d;
	By contact=By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/a");
	By Name=By.xpath("//*[@id=\"contact\"]/div/div/div[1]/form/div/div[1]/div/input");
	By Email=By.xpath("//*[@id=\"contact\"]/div/div/div[1]/form/div/div[2]/div/input");
	By Phone=By.xpath("//*[@id=\"contact\"]/div/div/div[1]/form/div/div[3]/div/input");
	By Testarea=By.xpath("//*[@id=\"message\"]");
	
	public ContactPage(WebDriver d2) {
		this.d=d2;
	}
	public void click1() {
		d.findElement(contact).click();
	}
	public void details( String name ) {
		d.findElement(Name).sendKeys(name);
		d.findElement(Email).sendKeys("arun123@gmail.com");
		d.findElement(Phone).sendKeys("9934567892");
		d.findElement(Testarea).sendKeys("Thank you for your good care");
	}
	
	public void title_verification() 
	{
		String actual=d.getTitle();
		String expected = "Contact";
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Tile verification passed");
		}
		else
		{
			System.out.println("Title verification failed");
		}
	}
}
	
    
       
  


