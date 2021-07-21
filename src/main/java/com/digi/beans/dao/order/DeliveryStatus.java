package com.digi.beans.dao.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public @Data class DeliveryStatus {
	
	private String currentStatus;
	private String stage1;
	private String stage1Date;
	private String stage2;
	private String stage2Date;
	private String stage3;
	private String stage3Date;
	private String stage4;
	private String stage4Date;

}
