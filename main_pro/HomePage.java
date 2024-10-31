package main_pro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {
    public void verifyLogo() {
        WebElement logo = d.findElement(By.xpath("//*[@id=\"header-sticky\"]/div/div/div/div[1]/div/a/img"));
        if (logo.isDisplayed()) {
            System.out.println("Logo is displayed");
        } else {
            System.out.println("Logo is not displayed");
        }

    }

    public void navigateToAboutPage() {
        d.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[2]/a")).click();
    }

    public void navigateToContact1Page() {
        d.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li[8]/a")).click();
    }
}
