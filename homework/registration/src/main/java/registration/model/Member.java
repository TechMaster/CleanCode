package registration.model;

/**
 * Factory method pattern: Concrete product
 */
public class Member extends User {

    public Member(UserInfo userInfo) {
        super(userInfo);
    }

    @Override
    public void register() {
        System.out.println(String.format("Register member %s", userInfo));
    }

}
