package pages;

import com.microsoft.playwright.Page;

public class Wikipedia {

    Page page;

    public Wikipedia(Page page){
        this.page = page;
    }
    public void search(String query){
        page.fill("#searchInput", query);
        page.click("#searchButton");
    }
    public String getUrl(){
        return page.url();
    }
    public String getMainText(){
        return page.title();
    }

}
