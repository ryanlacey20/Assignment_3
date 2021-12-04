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
        return true;
    }
}
