package com.accenture.nearby.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.nearby.entity.Merchant;

@Service
public interface MerchantService {

	List<Merchant> getAllMerchantsList(boolean activeFlag);

}
