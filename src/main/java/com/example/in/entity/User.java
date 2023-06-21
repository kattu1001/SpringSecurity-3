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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "users_table") // Name of the table in the database

public class User {

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

	@CollectionTable(name = "roles_table", joinColumns = @JoinColumn(name = "uid"))
	@Column(name = "role") // Name of the colum in database table
	private List<String> roles;

}
