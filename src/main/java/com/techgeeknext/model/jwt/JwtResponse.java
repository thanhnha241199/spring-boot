package com.techgeeknext.model.jwt;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private String jwttoken;
	private long id;
	private String username;

	public JwtResponse(String jwttoken, long id, String username ) {
		this.jwttoken = jwttoken;
		this.id = id;
		this.username = username;

	}

	public String getToken() {
		return this.jwttoken;
	}

	public void setToken(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}