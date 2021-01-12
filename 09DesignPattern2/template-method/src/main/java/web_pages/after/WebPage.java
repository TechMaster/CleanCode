package web_pages.after;

public abstract class WebPage {

    public void load() {
        showHeader();
        showNavigation();
        showBody();
        showFooter();
    }

    protected void showHeader() {
        System.out.println("Header");
    }

    protected void showNavigation() {
        System.out.println("Navigation");
    }

    protected abstract void showBody();

    protected void showFooter() {
        System.out.println("Footer");
    }

}
