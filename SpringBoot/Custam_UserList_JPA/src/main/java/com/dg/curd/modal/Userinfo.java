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

	
public class Userinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private String name;
	 private String work;
	 private String city;
	 private long mob;
	 

}
