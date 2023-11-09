package modelTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.PasswordValidator;

class PasswordValidatorTest {


	    private final PasswordValidator passwordValidator = new PasswordValidator();

	    @Test
	    public void testValidPassword() {
	        assertTrue(passwordValidator.validatePassword("Abcdefg1@"));
	    }

	    @Test
	    public void testInvalidShortPassword() {
	        assertFalse(passwordValidator.validatePassword("Abc12@"));
	    }

	    @Test
	    public void testInvalidNoDigitPassword() {
	        assertFalse(passwordValidator.validatePassword("Abcdefgh@"));
	    }

	    @Test
	    public void testInvalidNoLowerCasePassword() {
	        assertFalse(passwordValidator.validatePassword("ABCDEFGH1@"));
	    }

	    @Test
	    public void testInvalidNoUpperCasePassword() {
	        assertFalse(passwordValidator.validatePassword("abcdefgh1@"));
	    }

	    @Test
	    public void testInvalidNoSpecialCharPassword() {
	        assertFalse(passwordValidator.validatePassword("Abcdefg12"));
	    }
	}
