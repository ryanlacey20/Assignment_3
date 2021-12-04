import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTests {

    @Test
    public void emailAuthenticatorCorrect(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryan@mail.com") == true);

    }

    @Test
    public void emailAuthenticatorNoAtSymbol(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryanmail.com") == false);
    }

    @Test
    public void emailAuthenticatorSpaces(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryan @mail.com") == false);
    }

    @Test
    public void emailAuthenticatorFullStop(){
        Assertions.assertTrue(Controller.emailAuthenticator("ryan@mailcom"));
    }

}
