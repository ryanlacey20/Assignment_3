import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTests {

    @Test
    public void emailAuthenticatorCorrectTester(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryan@mail.com"));

    }

    @Test
    public void emailAuthenticatorAtSymbolTester(){
        Assertions.assertFalse(Controller.emailAuthenticator("ryanmail.com"));
        Assertions.assertFalse(Controller.emailAuthenticator("ryan@@mail.com"));
    }

    @Test
    public void emailAuthenticatorSpacesTester(){
        Assertions.assertFalse(Controller.emailAuthenticator("ryan @mail.com"));
    }

    @Test
    public void emailAuthenticatorFullStopTester(){
        Assertions.assertFalse(Controller.emailAuthenticator("ryan@mailcom"));
    }

    @Test
    public void emailAuthenticationOrganisationTester(){
        Assertions.assertFalse(Controller.emailAuthenticator("ryan.mail@com"));
    }

}
