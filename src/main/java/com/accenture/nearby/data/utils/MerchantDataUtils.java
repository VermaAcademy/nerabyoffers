package com.accenture.nearby.data.utils;

import com.accenture.nearby.entity.Address;
import com.accenture.nearby.entity.Merchant;

public class MerchantDataUtils {

	public static Address getMerchantData() {

		Merchant merchant1 = new Merchant();
		Merchant merchant2 = new Merchant();
		Merchant merchant3 = new Merchant();
		Merchant merchant4 = new Merchant();
		Merchant merchant5 = new Merchant();
		merchant1.setMerchantId(100);
		merchant1.setMerchantName("Dominas ");
		merchant1.setMerchantLogo("dominasLogo");
		merchant1.setCustomerID("1000");
		merchant1.setCardType("Citi");
		merchant1.setCustomerMobileNumber(9754734804L);

		Address address1 = new Address();
		address1.setId(10);
		address1.setStreet("Sector 21");
		address1.setCity("Gurugram");
		address1.setState("Haryana");
		address1.setZipCode("122016");
		address1.setLatitude("28.5143629");
		address1.setLongitude("77.0730087");
		address1.setCountry("India");
		address1.setParent(merchant1);

		return address1;
	}
}
