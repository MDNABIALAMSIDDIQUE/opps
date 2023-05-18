package com.dg.jpa.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table
public class Dist {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String statename;
		private int scode;
		private String Danem;
		private int  Dcode;
		private int totalDist;
		private String CMname;
		
		
		
}
