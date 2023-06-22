package demo4service;

import org.springframework.stereotype.Service;

@Service
public class LoginServices {
	public boolean isValidUser() {
		if("admin".equals("admin")) {
			return true;
		}else {
			return false;
		}
	}

//	@Override
//	public String toString() {
//		return "LoginServices [isValidUser()=" + isValidUser() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
}