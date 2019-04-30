package com.accenture.nearby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.nearby.entity.Merchant;
import com.accenture.nearby.repository.MerchantRepository;
import com.accenture.nearby.service.MerchantService;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantRepository merchantRepository;

	@Override
	public List<Merchant> getAllMerchantsList(boolean activeFlag) {
		return merchantRepository.getAllMerchantsList(activeFlag);
	}

}
