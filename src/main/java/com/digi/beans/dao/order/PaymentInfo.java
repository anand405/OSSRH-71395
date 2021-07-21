package com.digi.beans.dao.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public @Data class PaymentInfo {

	private String paymentType;
	private Double authorizedAmount;
	private Card cardPayment;
	private CIEBancomer cieBancomer;
	private DigitalWallet digitalWallet;
	private PaypalPayment payPal;

}
