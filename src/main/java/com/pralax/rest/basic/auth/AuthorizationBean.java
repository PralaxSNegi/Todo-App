package com.pralax.rest.basic.auth;

public class AuthorizationBean {
	
	private String message;
	
	public AuthorizationBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	
	

}
