package general;

import lombok.Data;
import pages.homepage.HomepagePageObject;
import pages.signup.SignupPageObject;

import java.util.ArrayList;

@Data
public class TestContext {
    private ArrayList<User> users = new ArrayList<>();
    private HomepagePageObject homepage;
    private SignupPageObject signupPage;

    public TestContext() {
        users.add(new User());
        this.homepage = new HomepagePageObject();
        this.signupPage = new SignupPageObject();
    }
}
