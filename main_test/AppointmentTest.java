package main_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main_pro.Appointment;
import pages.AppointmentPage;

public class AppointmentTest {

    WebDriver driver;
    Appointment appointmentPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://samaritanhospital.in/appointment");
        appointmentPage = new Appointment(driver);
    }

    @Test
    public void testAppointmentForm() {
        appointmentPage.clickAppointmentLink();
        appointmentPage.enterName("John Doe");
        appointmentPage.enterEmail("john.doe@example.com");
        appointmentPage.enterMobile("1234567890");
        appointmentPage.selectDepartment("Cardiology");
        appointmentPage.enterDate("2024-10-30");
        appointmentPage.selectGender();
        appointmentPage.enterSubject("Appointment Request");
        appointmentPage.enterMessage("Hello, I need an appointment.");
        appointmentPage.clickCheckbox();
        appointmentPage.clickSubmitButton();
    }
}
