import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {


    public static boolean emailAuthenticator(String email){

        if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@") ){
            return false;
        }
        if (email.contains(" ")) {
            return false;
        }
        if (!email.contains(".")){
            return false;
        }
        return email.indexOf("@") <= email.lastIndexOf(".");
    }

    public static boolean passwordAuthenticator(String password){
        String PASSWORD_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[*^&@!]).{7,})";
        Pattern pattern = Pattern.compile(PASSWORD_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches() && !password.contains(" ");
    }
}
