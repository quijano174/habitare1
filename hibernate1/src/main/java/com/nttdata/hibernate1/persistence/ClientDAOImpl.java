package com.nttdata.hibernate1.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClientDAOImpl implements ClientDAOInterface {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void insert(Client newClient) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.save(newClient);
		
		currentSession.close();
	}
	
	@Override
	public void update(Client updClient) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.update(updClient);
		
		currentSession.close();
	}
	
	@Override
	public void delete(Client delClient) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.delete(delClient);
		
		currentSession.close();		
	}
	
	
	@Override
	public Client searchById(final Long idClient) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Client customer = (Client) currentSession.get(Client.class, idClient);
		
		currentSession.close();
		
		return customer;
	}
	
	@Override
	public List<Client> searchAll() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		List<Client> customers = (List<Client>) currentSession.createQuery("desde lista").list();
		
		currentSession.close();
		
		return customers;
	}
	
	
	@Override
	public List<Client> searchByClientFullName(String firstNameClient, String lastName1Client, String lastName2Client){
		Session currentSession = entityManager.unwrap(Session.class);
		
		List<Client> customers =(List<Client>) currentSession.get(firstNameClient, lastName1Client);
		
		currentSession.close();
		
		return customers;
	}

	
}
