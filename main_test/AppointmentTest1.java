/*package main_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main_pro.AppointmentPage;

public class AppointmentTest1  {
	@BeforeClass
    public void setup() {
       
    	 d = new ChromeDriver();
        d.get("http://samaritanhospital.in/departments");
        appointmentPage = new AppointmentPage(d);
    }
    
	
    WebDriver d;
    AppointmentPage appointmentPage;
      
    @AfterClass
    public void tearDown() {
        if (d != null) {
            d.quit();
        }
    }

    @Test
    public void testFillAppointmentForm() {
        appointmentPage.click();
        appointmentPage.details("Ajay");
        appointmentPage.dropdown();
        appointmentPage.gender();
        appointmentPage.date();
        appointmentPage.checkbox();
        appointmentPage.title_verification();
    }
}*/
