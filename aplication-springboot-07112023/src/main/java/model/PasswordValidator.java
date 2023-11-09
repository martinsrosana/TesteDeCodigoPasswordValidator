package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class PasswordValidator {

	private static final int MIN_LENGTH = 9;

	public boolean validatePassword(String password) {
		return isLongEnough(password) &&
				hasDigit(password) &&
				hasLowerCaseLetter(password) &&
				hasUpperCaseLetter(password) &&
				hasSpecialCharacter(password);
	}

	private boolean isLongEnough(String password) {
		return password.length() >= MIN_LENGTH;
	}

	private boolean hasDigit(String password) {
		return password.chars().anyMatch(Character::isDigit);
	}

	private boolean hasLowerCaseLetter(String password) {
		return password.chars().anyMatch(Character::isLowerCase);
	}

	private boolean hasUpperCaseLetter(String password) {
		return password.chars().anyMatch(Character::isUpperCase);
	}

	private boolean hasSpecialCharacter(String password) {
		Pattern specialCharPattern = Pattern.compile("[!@#$%^&*()\\-+]");
		return specialCharPattern.matcher(password).find();
	}
}
