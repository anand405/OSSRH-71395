package com.digi.beans.dao.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public @Data class VariantInfo {

	private String size;
	private String material;
	private String color;
}
