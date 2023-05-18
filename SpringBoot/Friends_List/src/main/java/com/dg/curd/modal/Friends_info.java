package com.dg.curd.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Friend")

	
public class Friends_info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private String name;
	 private String work;
	 private String address;
	 private long mob;
	 

}
