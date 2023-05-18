package com.dg.curd.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Moblie_Info {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Cname;
	private String modal;
	private String Brand;
	private float Amount;
	
}
