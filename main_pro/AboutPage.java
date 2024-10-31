package main_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutPage extends BaseClass {
    public void verifyPageTitle() {
        String title =d.getTitle();
        if (title.contains("About Us")) {
            System.out.println("Page title matches: 'About' found");
        } else {
            System.out.println("Page title mismatch: 'About' not found");
        }

       
    }

    public void verifyContent() {
        WebElement content = d.findElement(By.xpath("/html/body/main/section[2]"));
        if (content.isDisplayed()) {
            System.out.println("Content is displayed");
        } else {
            System.out.println("Content is not displayed");
        }

    }
}
