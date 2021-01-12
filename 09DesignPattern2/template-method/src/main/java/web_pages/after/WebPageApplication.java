package web_pages.after;

import web_pages.before.ContactPage;
import web_pages.before.FAQPage;
import web_pages.before.HomePage;

public class WebPageApplication {

    public static void main(String[] args) {
        web_pages.before.HomePage homePage = new HomePage();
        homePage.load();

        web_pages.before.ContactPage contactPage = new ContactPage();
        contactPage.load();

        web_pages.before.FAQPage faqPage = new FAQPage();
        faqPage.load();
    }

}
