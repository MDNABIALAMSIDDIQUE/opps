package com.database.jpa.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ActorData_info")
@Data
public class ActorData {
	@Column(name = "Actor_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aid;
	@Column(name = "Actor_NAME",length = 25)
	private String aName;
	@Column (name = "Actor_Category")
	private String category;
	@Column(name = "Actor_Phone_NO", length = 25)
	private Long mobileNo;
	

}
