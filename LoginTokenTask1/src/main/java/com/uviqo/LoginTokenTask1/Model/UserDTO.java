package com.uviqo.LoginTokenTask1.Model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "USERS")
public class UserDTO {
	
	@Id
    private String username;
    
    @JsonIgnore
    private String password;
	
	public String getUsername() {
		
		return username;
	
	}
	
	public void setUsername(String username) {
		
		this.username = username;
	}
	
	
	public String getPassword() {
		
		return password;
	}
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
}
