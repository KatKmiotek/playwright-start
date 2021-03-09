package search;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NextTests extends BaseTests {
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

}
