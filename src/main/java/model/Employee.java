package model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String address;
	private String docter;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, String address, String docter) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.docter = docter;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocter() {
		return docter;
	}

	public void setDocter(String docter) {
		this.docter = docter;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", docter="
				+ docter + "]";
	}
	
	
	
}
