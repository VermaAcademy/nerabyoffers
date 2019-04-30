package com.accenture.nearby.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.nearby.entity.Merchant;
import com.accenture.nearby.repository.MerchantRepository;

@Repository
public class MerchantRepositoryImpl implements MerchantRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Merchant> getAllMerchantsList(boolean activeFlag) {
		Session session = sessionFactory.openSession();
		List<Merchant> merchantList = session.createCriteria(Merchant.class).add(Restrictions.eq("activeFlag", String.valueOf(activeFlag))).list();
		session.close();
		return merchantList;

	}

}
