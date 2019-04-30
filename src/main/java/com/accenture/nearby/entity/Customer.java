package com.accenture.nearby.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID")
	private Integer customerId;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "CUSTOMER_MOBILE_NUMBER")
	private Long customerMobileNumber;
	
	@Column(name = "CARD_ID")
	private String cardId;
	
	@Column(name = "CUSTOMER_CARD_NUMBER")
	private String customerCardNumber;
	
	@Column(name = "CARD_TYPE")
	private String cardType;
	
	@Column(name = "CARD_IMAGE")
	private String cardImage;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(Long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCustomerCardNumber() {
		return customerCardNumber;
	}

	public void setCustomerCardNumber(String customerCardNumber) {
		this.customerCardNumber = customerCardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardImage() {
		return cardImage;
	}

	public void setCardImage(String cardImage) {
		this.cardImage = cardImage;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobileNumber="
				+ customerMobileNumber + ", cardId=" + cardId + ", customerCardNumber=" + customerCardNumber
				+ ", cardType=" + cardType + ", cardImage=" + cardImage + "]";
	}

		
}
