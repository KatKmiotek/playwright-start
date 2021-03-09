package base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

public class BaseTests {

    private Browser browser;
    protected Next next;

    @BeforeClass
    public void setUp(){

        //Open a browser (supports Chromium (Chrome, Edge), Firefox, and Webkit (Safari))
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().withHeadless(true));

//        BrowserContext context = browser.newContext(new Browser.NewContextOptions()
//                .withLocale("pol-PL")
//                .withTimezoneId("Europe/Warsaw"));


        //A single browser tab
        Page page = browser.newPage();
        page.navigate("https://www.next.co.uk/");
        next = new Next(page);


    }

    @AfterClass
    public void tearDown(){
        browser.close();
    }
}