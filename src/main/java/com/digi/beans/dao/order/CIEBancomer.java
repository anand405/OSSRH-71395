package com.digi.beans.dao.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CIEBancomer {

	private String paymentMethod;
	private String cieBancomerReference;
	private String estatus;
	private String openPayExiryMessage;
	private String openPayExpiryDateAndTime;
	
}
