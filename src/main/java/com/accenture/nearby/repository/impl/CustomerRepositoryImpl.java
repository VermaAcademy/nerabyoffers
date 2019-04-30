package com.accenture.nearby.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.nearby.entity.Customer;
import com.accenture.nearby.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getAllCustomersList() {
		Session session = sessionFactory.openSession();
		List<Customer> customerList = session.createCriteria(Customer.class).list();
		session.close();
		return customerList;
	}

	@Override
	public Customer registerCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Integer id = (Integer)session.save(customer);
		customer = (Customer)session.get(Customer.class, new Integer(id)); 
		return customer;
	}

	@Override
	public void deleteCustomer(Integer customerId) {

		try {
			Session session = sessionFactory.openSession();
			Object o = session.load(Customer.class, new Integer(customerId));
			Customer p = (Customer) o;
		    Transaction tx = session.beginTransaction();
			session.delete(p);
			tx.commit();
			session.close();
			System.out.println("Object Deleted successfully.....!!");
		} catch (SecurityException | IllegalStateException e) {
			e.printStackTrace();
		}

	}

}
