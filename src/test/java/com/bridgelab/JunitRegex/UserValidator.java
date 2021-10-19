package com.bridgelab.JunitRegex;

import java.util.regex.Pattern;

public class UserValidator {
	public static final String NAME_PATTERN = "[A-Z][A-Za-z][A-Za-z][A-Za-z]*";
	public static final String MOBILE_NO_PATTERN = "(0|91)?[6-9][0-9]{9}";
	public static final String EMAIL_PATTERN = "[a-zA-Z0-9][A-Za-z0-9_.]*@[a-zA-Z0-9]+([.][A-Za-z]+)+";
	public static final String PASSWORD_PATTERN ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$])[a-zA-Z0-9!#$@]{8,}";



	public boolean validateFirstName(String Fname) {
		Pattern p = Pattern.compile(NAME_PATTERN);
		return p.matcher(Fname).matches();
	}

	public boolean validateLastName(String Lname) {
		Pattern p = Pattern.compile(NAME_PATTERN);
		return p.matcher(Lname).matches();
	}
	public boolean validateEmail(String Email) {
		Pattern p = Pattern.compile(EMAIL_PATTERN);
		return p.matcher(Email).matches();
	}
	public boolean validateMobile(String number) {
		Pattern p = Pattern.compile(MOBILE_NO_PATTERN);
		return p.matcher(number).matches();
	}
	public boolean validatePassword(String password) {
		Pattern p = Pattern.compile(PASSWORD_PATTERN);
		return p.matcher(password).matches();
	}
}
