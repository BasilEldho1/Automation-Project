package main_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Appointment {

    private WebDriver driver;
    private By appointmentLink = By.xpath("//*[@id='mobile-menu']/ul/li[7]/a");
    private By nameField = By.xpath("//input[@id='name']");
    private By emailField = By.xpath("//input[@id='email']");
    private By mobileField = By.xpath("//input[@id='mobile']");
    private By departmentSelect = By.xpath("//select[@id='speciality']");
    private By dateField = By.xpath("//input[@id='date']");
    private By genderRadio = By.xpath("//input[@id='inlineRadio2']");
    private By subjectField = By.xpath("//input[@id='subject']");
    private By messageField = By.xpath("//textarea[@id='message']");
    private By checkbox = By.xpath("//div[@id='recaptcha-anchor']");
    private By submitButton = By.xpath("//button[@type='submit']");

    public Appointment(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAppointmentLink() {
        driver.findElement(appointmentLink).click();
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterMobile(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void selectDepartment(String department) {
        WebElement departmentElement = driver.findElement(departmentSelect);
        departmentElement.sendKeys(department);
    }

    public void enterDate(String date) {
        driver.findElement(dateField).sendKeys(date);
    }

    public void selectGender() {
        driver.findElement(genderRadio).click();
    }

    public void enterSubject(String subject) {
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void enterMessage(String message) {
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickCheckbox() {
        driver.findElement(checkbox).click();
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }
}
