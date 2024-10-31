package main_test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main_pro.BaseClass;
import main_pro.ContactPage;
public class TestContactPage extends BaseClass {

    @BeforeClass
    public void setup() {
        d.manage().window().maximize();
    }

    @Test
    public void testContactPage() throws InterruptedException {
        ContactPage contactPage = new ContactPage(d);
        contactPage.click1();
        contactPage.details("Arun joy");
        contactPage.title_verification();
    }

    @AfterTest
    public void tearDown() {
        d.close();
    }

}
	
	
	