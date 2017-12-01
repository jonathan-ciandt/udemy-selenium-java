package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class UserInformationTest {
    @Test
    public void testAddAditionalInformationUser() {
        //Open chrome
        WebDriver webDriver = new ChromeDriver();

        //Navigate in the browser, go to taskit page
        webDriver.get("http://www.juliodelima.com.br/taskit");

        assertEquals(1, 1);
    }
}
