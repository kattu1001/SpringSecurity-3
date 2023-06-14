package com.example.in.entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users_tab") // Name of the table in the database

public class User {

	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public User() {
		
	}
	
	public User(Integer uid, String fname, String lname, String username, String password, List<String> roles) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", username=" + username + ", password="
				+ password + ", roles=" + roles + "]";
	}
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
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	@Id // PRimary Key Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer uid;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column(unique = true)
	private String username;
	@Column
	private String password;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "roles_tab", joinColumns = @JoinColumn(name = "uid"))
	@Column(name = "role") // Name of the colum in database table
	private List<String> roles;

}
