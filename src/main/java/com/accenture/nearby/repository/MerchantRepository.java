package com.accenture.nearby.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.accenture.nearby.entity.Merchant;

@Repository
public interface MerchantRepository {

	List<Merchant> getAllMerchantsList(boolean activeFlag);

}
