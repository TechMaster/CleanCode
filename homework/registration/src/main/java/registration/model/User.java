package registration.model;

/**
 * Factory method pattern: Product
 */
public abstract class User {

    protected UserInfo userInfo;

    protected User(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public abstract void register();

}
