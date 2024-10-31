package main_test;

import org.testng.annotations.Test;

import main_pro.AboutPage;

public class TestAboutPage extends AboutPage {
    @Test
    public void testPageTitle() {
        verifyPageTitle();
    }

    @Test
    public void testContent() {
        verifyContent();
    }
}

