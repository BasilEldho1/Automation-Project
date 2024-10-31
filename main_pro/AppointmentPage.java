/*package main_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    WebDriver d;

    By Appointment = By.xpath("//*[@id='mobile-menu']/ul/li[7]/a");
    By Name = By.xpath("//input[@id='name']");
    By Email = By.xpath("//*[@id='contact']/div/div/div[1]/div[2]/div/form/div[2]/input");
    By Mobile = By.xpath("//*[@id='contact']/div/div/div[1]/div[2]/div/form/div[3]/input");
    By Gender = By.xpath("//*[@id='inlineRadio2']");
    By Date = By.xpath("//*[@id='contact']/div/div/div[1]/div[2]/div/form/div[4]/div/div[2]/input");
    By Department = By.xpath("//*[@id='speciality']");
    By Subject = By.xpath("//*[@id='contact']/div/div/div[1]/div[2]/div/form/div[5]/input");
    By Message = By.xpath("//*[@id='message']");
    By Checkbox = By.xpath("//*[@id='recaptcha-anchor']");

    public AppointmentPage(WebDriver d) {
        this.d = d;
    }
    public void details(String name) {
        d.findElement(Name).sendKeys(name);
        d.findElement(Email).sendKeys("ajay2003@gmail.com");
        d.findElement(Mobile).sendKeys("9923456789");
        d.findElement(Subject).sendKeys("Want to see the doctor");
        d.findElement(Message).sendKeys("Hello");
    }

    public void title_verification() {
        String actual = d.getTitle();
        String expected = "Appointment";
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
    }

    public void click() {
        d.findElement(Appointment).click();
    }

    

    public void date() {
        WebElement dateField = d.findElement(Date);
        dateField.sendKeys("10/11/2024");
    }

    public void gender() {
        d.findElement(Gender).click();
    }

    public void dropdown() {
        WebElement departmentDropdown = d.findElement(Department);
        Select select = new Select(departmentDropdown);
        select.selectByVisibleText("ENT");

        String selectedOption = select.getFirstSelectedOption().getText();
        System.out.println("Selected Option: " + selectedOption);
    }

    public void checkbox() {
        d.findElement(Checkbox).click(); // Consider adding handling for reCAPTCHA if needed
    }
}*/
