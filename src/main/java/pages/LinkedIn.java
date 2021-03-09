package pages;

import com.microsoft.playwright.Page;

public class LinkedIn {
    Page page;
    String username_input = "#session_key";
    String password_input = "#session_password";
    String sign_in_button = "#main-content > section.section.section--hero > div.sign-in-form-container > form > button";


    public LinkedIn(Page page){
        this.page = page;
    }
    public void login(){
        page.waitForSelector(username_input);
        page.fill(username_input, "katarzyna.kmiotek@yahoo.com");
        page.waitForSelector(password_input);
        page.fill(password_input, "");
        page.waitForSelector(sign_in_button);
        page.click(sign_in_button);

    }
    public String getUrl(){
        return page.url();
    }
}
