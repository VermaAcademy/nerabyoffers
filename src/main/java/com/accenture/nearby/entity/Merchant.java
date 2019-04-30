package com.accenture.nearby.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MERCHANT")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Merchant {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MERCHANT_ID")
	private Integer merchantId;

	@Column(name = "MERCHANT_NAME")
	private String merchantName;
	
	@Column(name = "CUSTOMER_ID")
	private String customerID;
	
	@Column(name = "MERCHANT_LOGO")
	private String merchantLogo;
	
	@Column(name = "CUSTOMER_MOBILE_NUMBER")
	private Long customerMobileNumber;
	
	@Column(name = "CARD_TYPE")
	private String cardType;
	
	@Column(name = "CARD_OFFERS")
	private String cardOffers;
	
	@Column(name = "ACTIVE_FLAG")
	private String activeFlag;

	public String getCardOffers() {
		return cardOffers;
	}

	public void setCardOffers(String cardOffers) {
		this.cardOffers = cardOffers;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(Long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
	public String getMerchantLogo() {
		return merchantLogo;
	}

	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}
	
	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", merchantName=" + merchantName + ", customerID=" + customerID
				+ ", merchantLogo=" + merchantLogo + ", customerMobileNumber=" + customerMobileNumber + ", cardType="
				+ cardType + ", cardOffers=" + cardOffers + ", activeFlag=" + activeFlag + "]";
	}
}
