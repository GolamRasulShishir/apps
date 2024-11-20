package com.jtspringproject.JtSpringProject.models;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="CUSTOMER")
@Table
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String username;
	
	private String email;
	
	private String password;
	
	private String role;
	
	private String address;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		User user = (User) o;
		return id == user.id &&
			   Objects.equals(username, user.username) &&
			   Objects.equals(email, user.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, email);
	}

	@Override
	public String toString() {
		return "User{" +
			   "id=" + id +
			   ", username='" + username + '\'' +
			   ", email='" + email + '\'' +
			   '}';
	}
	 

}
