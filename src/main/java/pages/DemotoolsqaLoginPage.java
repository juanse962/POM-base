package pages;
                               
import org.openqa.selenium.By;

public class DemotoolsqaLoginPage
{
    private DemotoolsqaLoginPage() {
        // Do nothing because of X and Y.
    }
    public static final By TXT_USER = By.id("userName");
    public static final By TXT_PASS = By.id("password");
    public static final By BTN_LOGIN = By.id("login");
}