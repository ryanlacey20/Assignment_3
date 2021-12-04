import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTests {

    @Test
    public void emailAuthenticatorCorrectTester(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryan@mail.com") == true);

    }

    @Test
    public void emailAuthenticatorNoAtSymbolTester(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryanmail.com") == false);
    }

    @Test
    public void emailAuthenticatorSpacesTester(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryan @mail.com") == false);
    }

    @Test
    public void emailAuthenticatorNoFullStopTester(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryan@mailcom") == false);
    }

}
