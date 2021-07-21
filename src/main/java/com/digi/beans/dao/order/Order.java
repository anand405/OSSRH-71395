package com.digi.beans.dao.order;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection="orders")
@Getter
@Setter
public @Data class Order {
	
	@Id
	@Indexed
	private String orderRef;
	private String canal;
	private String storeNumber;
	private String customerId;
	private String atgOrderId;
	private String email;
	private String firstname;
	private String lastname;
	private Date purchaseDate;
	private String shippingStatus;
	private Double orderTotal;
	private String boleta;
	private String terminal;
	private String tienda;
	private String storeName;
	private String chargeNumber;
	private String facturacion;
	private Boolean marketPlace;
	private Boolean giftRegistry;
	private String eventNumber;
	private String celebrantName;
	private String beneficiaryName;
	private String eventName;
	private Boolean personalpurchase;
	private Boolean cnc;
	private String cncStoreLocationId;
	private String sellerName;
	private Long deliveryDate;
	private Boolean ratingsGiven;
	private Address address;
	private List<Item> items;
	private List<PaymentInfo> paymentInfo;
	
}
