package web_pages.before;

public class FAQPage {

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
        System.out.println("FAQ");
    }

    private void showFooter() {
        System.out.println("Footer");
    }

}
