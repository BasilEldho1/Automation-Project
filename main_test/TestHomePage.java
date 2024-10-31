package main_test;


import org.testng.annotations.Test;

import main_pro.AboutPage;
import main_pro.ContactPage;
import main_pro.HomePage;

public class TestHomePage extends HomePage {
    @Test
    public void testLogo() {
        verifyLogo();
    }

    @Test
    public void testNavigationToAboutPage() {
        navigateToAboutPage();
        AboutPage aboutPage = new AboutPage();
        aboutPage.verifyPageTitle();
    }

    @Test
    public void testNavigationToContact1Page() {
    	navigateToContact1Page() ;
    	ContactPage contactPage = new ContactPage(d);
        contactPage.title_verification();
    }

}
