public class Controller {
    public static boolean emailAuthenticator(String email){
        if (!email.contains("@")) {
            return false;
        }
        if (email.contains(" ")) {
            return false;
        }
        return email.contains(".");
    }

    public static boolean passwordAuthenticator(String password){
        return true;
    }
}
