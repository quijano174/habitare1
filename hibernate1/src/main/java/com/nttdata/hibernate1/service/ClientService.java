package com.nttdata.hibernate1.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.hibernate1.persistence.Client;
import com.nttdata.hibernate1.persistence.ClientDAOImpl;


@Service
public class ClientService {
	
	@Autowired
	private EntityManager entityManager;
	
	private static ClientDAOImpl clientDAO;
	
	public ClientService() {
		clientDAO = new ClientDAOImpl();
	}
	
	public void insert(Client newClient) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		clientDAO.insert(newClient);
		
		currentSession.close();
	}
	
	public void update(Client updClient) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		clientDAO.update(updClient);
		
		currentSession.close();
	}
	
	public void delete(Client delClient) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Long idDelete = delClient.getIdClient();
		
		Client customer = clientDAO.searchById(idDelete);
		
		clientDAO.delete(customer);
		
		currentSession.close();	
	}
	
	public Client searchById(final Long idClient) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Client customer = (Client) currentSession.get(Client.class, idClient);
		
		
		currentSession.close();
		return customer;
	}
	
	
	public List<Client> searchAll();
	
	public List<Client> searchByClientFullName(String firstNameClient, String lastName1Client, String lastName2Client);
}
