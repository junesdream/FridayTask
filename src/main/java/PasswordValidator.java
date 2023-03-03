public class PasswordValidator {
    public static void main(String[] args) {
        String password = "MyPassword123";

        System.out.println("Password length is aceptable " + lengthOfPassword("Alsdjb458"));
        System.out.println("Password contains numbers " + containPasswordNumber("Djeogbn1o"));
    }

    //2. Methode to check for length of password
    public static boolean lengthOfPassword(String password) {

        if (password.length() <= 8) {
            return false;
        } else {
            return true;
        }
    }

    //3. Methode to check if the password contains the number
    public static boolean containPasswordNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    //4. Methode: password contains small letters?

    public static boolean checkBuchstaben(String password) {
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (hasLowerCase && hasUpperCase) {
                return true;
            }
        }
        return false;
    }

    //5. Check, if password is bad
    public static boolean isPasswordSuitable(String passwort) {
        // List of not suitable passwords
        String[] badPasswords = {"passwort", "123456", "geheim", "hallo", "admin"};

        // Check, if the password contains unsuitable password in der List
        for (int i = 0; i < badPasswords.length; i++) {
            if (passwort.equals(badPasswords)) {
                return false; // Password is not suitable
            }
        }
        //The password is valid
        return true;
    }
}

//1. Methode to validate password
   /*public static boolean isValidPassword(String password){
        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
        return false;
    }

    public static boolean isValidPassword(String password){
        if (isValidPassword(password) = password) {
            return true;
        } else {
            return false;
        }
    } */
