import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordAuthenticatorTests {

    @Test
    public void correctTester(){
        Assertions.assertTrue(Controller.passwordAuthenticator("greencat1!"));
        Assertions.assertTrue(Controller.passwordAuthenticator("Greencat1!"));
    }

    @Test
    public void lengthTester(){
        Assertions.assertFalse(Controller.passwordAuthenticator("gren1!"));
    }

//    @Test
//    public void blankSpaceTester(){
//        Assertions.assertFalse(Controller.passwordAuthenticator("greencat 1!"));
//    }

    @Test
    public void digitTester(){
        Assertions.assertFalse(Controller.passwordAuthenticator("greencat!"));
    }

    @Test
    public void symbolTester(){
        Assertions.assertFalse(Controller.passwordAuthenticator("greencat1"));
    }

    @Test
    public void characterTester(){Assertions.assertFalse(Controller.passwordAuthenticator("123456!"));}
}
