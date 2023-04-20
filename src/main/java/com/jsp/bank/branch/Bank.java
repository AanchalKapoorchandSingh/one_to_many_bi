package com.jsp.bank.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
@OneToMany
private List<Branch> branches;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Branch> getBranches() {
	return branches;
}

public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
}
