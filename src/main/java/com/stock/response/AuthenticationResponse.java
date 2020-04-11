package com.stock.response;

public class AuthenticationResponse {
	
	private String usrToken;

	public String getUsrToken() {
		return usrToken;
	}

	public void setUsrToken(String usrToken) {
		this.usrToken = usrToken;
	}

	public AuthenticationResponse(String usrToken) {
		super();
		this.usrToken = usrToken;
	}
	

}
