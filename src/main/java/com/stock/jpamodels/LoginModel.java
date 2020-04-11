package com.stock.jpamodels;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="login_data")
public class LoginModel {

	@Id
    String registered_usr;
	String pass;
	public String getRegistered_usr() {
		return registered_usr;
	}
	public void setRegistered_usr(String registered_usr) {
		this.registered_usr = registered_usr;
	}
	public String getpass() {
		return pass;
	}
	public void setpass(String pass) {
		this.pass = pass;
	}
	public LoginModel(String registered_usr, String pass) {
		super();
		this.registered_usr = registered_usr;
		this.pass = pass;
	}
	public LoginModel() {
		super();
	}
	

}
