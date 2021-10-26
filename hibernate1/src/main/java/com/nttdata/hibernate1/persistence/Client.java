package com.nttdata.hibernate1.persistence;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idClient")
	private Long idClient;
	
	@Column(name = "firstNameClient")
	private String firstNameClient;
	
	@Column(name = "lastName1Client")
	private String lastName1Client;
	
	@Column(name = "lastName2Client")
	private String lastName2Client;
	
	@Column(name = "nifClient", length = 9, nullable = false, unique = true)
	private String nifClient;
	
	
	public Client() {
	}
	
	public Client(Long id, String firstName, String lastName1, String lastName2, String nif){
		this.idClient = id;
		this.firstNameClient = firstName;
		this.lastName1Client = lastName1;
		this.lastName2Client = lastName2;
		this.nifClient = nif;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getFirstNameClient() {
		return firstNameClient;
	}

	public void setFirstNameClient(String firstNameClient) {
		this.firstNameClient = firstNameClient;
	}

	public String getLastName1Client() {
		return lastName1Client;
	}

	public void setLastName1Client(String lastName1Client) {
		this.lastName1Client = lastName1Client;
	}

	public String getLastName2Client() {
		return lastName2Client;
	}

	public void setLastName2Client(String lastName2Client) {
		this.lastName2Client = lastName2Client;
	}

	public String getNifClient() {
		return nifClient;
	}

	public void setNifClient(String nifClient) {
		this.nifClient = nifClient;
	}	
	
}
