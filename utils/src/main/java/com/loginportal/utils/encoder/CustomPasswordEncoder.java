package com.loginportal.utils.encoder;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {
	
	public String generateSalt() {
		return BCrypt.gensalt(12);
	}

	public String encodeWithSalt(CharSequence rawPassword, String salt) {
		return BCrypt.hashpw(rawPassword.toString(), salt);
	}

	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		return false;
	}

}
