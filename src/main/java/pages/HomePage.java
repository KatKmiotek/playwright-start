package pages;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.Page.WaitForSelectorOptions.State.ATTACHED;

public class HomePage {
    private Page page;

    public HomePage(Page page){
        this.page = page;

    }

    public String getUrl() {
        return page.url();
    }

    public void getBlog() throws InterruptedException {
        page.click("#skip-nav > div > div > a");
        page.waitForSelector("#skip-nav > div > div > a");

    }
    public String getTitle(){
        return page.title();
    }
}
