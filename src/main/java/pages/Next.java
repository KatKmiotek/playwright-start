package pages;

import com.microsoft.playwright.Page;

import java.util.List;
import java.util.stream.Collectors;

public class Next {
    Page page;
    String navBar = "#MainNavigation";
    String navBarElements = "li.Primarynavlinks";

    public Next(Page page){
        this.page = page;
    }

    public String getUrl(){
        return page.url();
    }

    public void checkNavBar(){
        page.getAttribute(navBar, "id").equalsIgnoreCase("HeaderNavigation");
    }
    public List<String> getNavbarElements(){
        return page.querySelectorAll(navBarElements)
                .stream()
                .map(e-> e.innerText())
                .collect(Collectors.toList());
    }
}
