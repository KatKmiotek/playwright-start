package search;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NextTest extends BaseTests {
    @Test
    public void checkUrl(){
     assertEquals(next.getUrl(), "https://www.next.co.uk/");
    }

    @Test
    public void checkNavBar(){
        next.checkNavBar();
    }

    @Test
    public void checkNavBarElements(){
        next.getNavbarElements();
        assertEquals(next.getNavbarElements().size(), 14);
    }

    @Test
    public void clickNavBar(){
        next.clickNavBarItem("New In");
        assertEquals(next.getUrl(), "https://www.next.co.uk/shop/feat-newin");
        next.clickHome();
        next.clickNavBarItem("boys");
        assertEquals(next.getUrl(), "https://www.next.co.uk/boys");
    }
}
