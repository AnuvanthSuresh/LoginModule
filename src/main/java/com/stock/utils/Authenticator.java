package com.stock.utils;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stock.jpamodels.LoginModel;
import com.stock.jparepository.LoginTableRepository;

@Component
public class Authenticator {

	@Autowired
	LoginTableRepository repo;

	public Boolean AuthUser(String username, String password) {

		ArrayList<LoginModel> userTable = (ArrayList<LoginModel>) repo.findAll();

		Boolean Flag = false;

		for (LoginModel users : userTable) {

			if (users.getRegistered_usr().equals(username) && users.getpass().equals(password)) {

				System.out.println("User authenticated");
				Flag = true;
			} 
		}

		return Flag;

	}

}
