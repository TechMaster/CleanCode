package web_pages.before;

public class WebPageApplication {

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.load();

        ContactPage contactPage = new ContactPage();
        contactPage.load();

        FAQPage faqPage = new FAQPage();
        faqPage.load();
    }

}
