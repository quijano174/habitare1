package com.nttdata.hibernate1.persistence;

import java.util.List;

public interface ClientDAOInterface {
	
	
	public void insert(Client newClient);
	
	public void update(Client updClient);
	
	public void delete(Client delClient);
	
	public Client searchById(final Long idClient);
	
	
	public List<Client> searchAll();
	
	public List<Client> searchByClientFullName(String firstNameClient, String lastName1Client, String lastName2Client);
}
