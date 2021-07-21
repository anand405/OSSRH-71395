package com.digi.beans.dao.order;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public @Data class Item {

	@Indexed
	@Id
	private String skuId;
	private String sellerSkuId;
	private int quantity;
	private long productId;
	private String productType;
	@TextIndexed
	private String displayName;
	private String estimatedDeliveryDate;
	private Double itemTotalListPrice;
	private String section;
	private String groupId;
	private Double itemTotal;
	private String promotion;
	private String isSkuChanged;
	private String maximumTime;
	private String serviceCenter;
	private String warrantyDuration;
	private String isComboItem;
	private String eddMessage;
	private String smallImage;
	private Boolean isBundle;
	private Boolean propina;
	private String isExtendedWarranty;
	private String commandNumber;
	private String parcelNumber;
	private String deliveryPartner;
	private String digitalErrorMessage;
	private String dfProductKey;
	private String dfURL;
	private String dfInstructions;
	private String brandId;
	private String meterialGroup;
	private String departmentId;
	private Boolean giftWithPurchase;
	private List<String> availableServices;
	
	private VariantInfo variantInfo;
	private DeliveryStatus deliveryStatus;

}
