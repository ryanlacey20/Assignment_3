import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordAuthenticatorTests {

    @Test
    public void correctTester(){
        Assertions.assertTrue(Controller.passwordAuthenticator("greencat1!") == true);
    }

    @Test
    public void lengthTester(){
        Assertions.assertTrue(Controller.passwordAuthenticator("gren1!") == false);
    }

    @Test
    public void blankSpaceTester(){
        Assertions.assertTrue(Controller.passwordAuthenticator("greencat 1!") == false);
    }

    @Test
    public void digitTester(){
        Assertions.assertTrue(Controller.passwordAuthenticator("greencat!") == false);
    }

    @Test
    public void symbolTester(){
        Assertions.assertTrue(Controller.passwordAuthenticator("greencat1") == false);
    }
}
