package pages;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.microsoft.playwright.Page.WaitForSelectorOptions.State.ATTACHED;

public class Next {
    Page page;
    String navBar = "#MainNavigation";
    String navBarElements = "li.Primarynavlinks";
    static List<String> navbarList;

    public Next(Page page){
        this.page = page;
    }

    public String getUrl(){
        return page.url();
    }

    public void checkNavBar(){
        page.getAttribute(navBar, "id").equalsIgnoreCase("HeaderNavigation");
        page.screenshot(new Page.ScreenshotOptions()
                .withPath(Paths.get("src/test/resources/screenshots/navBar.png")));
    }
    public List<String> getNavbarElements(){
        navbarList =  page.querySelectorAll(navBarElements)
                .stream()
                .map(e-> e.innerText())
                .collect(Collectors.toList());
        return navbarList;
    }

    public void clickNavBarItem(String value){
            Page.WaitForSelectorOptions expectedState = new Page.WaitForSelectorOptions().withState(ATTACHED);
            String selector = "text=" + value;
            page.waitForSelector(selector, expectedState);
            page.click(selector);

    }

    public void clickHome() {
        page.click("#header-logo.SiteLogo.gold");
    }
}
