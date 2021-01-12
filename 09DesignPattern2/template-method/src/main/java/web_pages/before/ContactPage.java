package web_pages.before;

public class ContactPage {

    public void load() {
        showHeader();
        showNavigation();
        showBody();
        showFooter();
    }

    private void showHeader() {
        System.out.println("Header");
    }

    private void showNavigation() {
        System.out.println("Navigation");
    }

    private void showBody() {
        System.out.println("Contact");
    }

    private void showFooter() {
        System.out.println("Footer");
    }

}
