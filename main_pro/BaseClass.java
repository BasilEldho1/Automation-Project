package main_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    public static WebDriver d;

    @BeforeSuite
    public void bc()
	{
		d=new ChromeDriver();
		d.get("https://patientportal.rajagirihospital.com/");
		d.manage().window().maximize();
	}
    

    @AfterSuite
    public void tearDown() {
        d.quit();
    }
}

