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
public @Data class Address {
	
	private String nickName;
	private String street;
	private String entreLasCalles;
	private String yCalle;
	private String ciudad;
	private String estado;
	private String pais;
	private String muncipioDelegacion;
	private String exteriorNumber;
	private String codigoPostal;
	private String phone;
	private String officePhoneNumber;
	private String cellPhone;
		
}
