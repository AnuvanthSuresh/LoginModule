package com.stock.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.stock.request.AuthenticationRequest;
import com.stock.utils.Authenticator;
import com.stock.utils.JWTtokenUtils;

@RestController
public class LoginController {

	@Autowired
	JWTtokenUtils token;

	@Autowired
	Authenticator auth;

	@Autowired
	HttpSession session;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticationService(@RequestBody AuthenticationRequest authenticationRequest, HttpServletRequest request) {

		if (auth.AuthUser(authenticationRequest.getUsername(), request.getHeader("password"))) {

			String Token = token.GenerateToken(authenticationRequest.getUsername()).trim();
			session.setAttribute("Token", Token);
			return Token;
		} else {
			return "User Not Authorised";
		}

	}
}
