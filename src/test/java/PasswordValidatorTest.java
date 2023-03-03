import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {

    //2. Check the length of password
    @Test
    public void givenInvalidPasswordTooShort_whenIsValidPassword_thenFalse() {
        // GIVEN
        String password = "pass";

        // WHEN
        boolean actual = PasswordValidator.lengthOfPassword(password);

        // THEN
        assertEquals(false, actual);
    }

    // 3. Check, if the password contains the number
    @Test
    public void givenInvalidPasswordNoNumbers_whenIsValidPassword_thenFalse() {
        // GIVEN
        String password = "MyPassword";

        // WHEN
        boolean actual = PasswordValidator.containPasswordNumber(password);

        // THEN
        assertEquals(false, actual);
    }

    // 4. Check, if the password contains small letters
    @Test
    public void givenInvalidPasswordContainsSmallLetters(){
        // GIVEN
        String password = "MyPassword";

        // WHEN
        boolean actual = PasswordValidator.checkBuchstaben(password);

        // THEN
        assertEquals(true, actual);
    }

    //Test 5
    @Test
    public void givenInvalidPasswordisSuitable(){
        // GIVE
        String[] badPasswords = {"passwort", "123456", "abcdef", "ABCDE123", "myname"};

        //WHEN
        boolean actual = PasswordValidator.isPasswordSuitable(Arrays.toString(badPasswords));

        // THEN
        assertEquals(true, actual);
    }
}

//1. Check the given password is validable
    /*
    @Test
    public void givenValidPassword_whenIsValidPassword_thenTrue() {
        // GIVEN
        String password = "MyPassword123";

        // WHEN
        boolean actual = PasswordValidator.isValidPassword(password);

        // THEN
        assertEquals(true, actual);
    } */

