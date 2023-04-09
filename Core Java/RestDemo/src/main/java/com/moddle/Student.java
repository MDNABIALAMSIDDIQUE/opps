package com.moddle;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Student {
@Id	
 Integer id;
@Column(name="name",length = 20)

 String name;
@Column(name="address",length = 20)
 String addrese;
 @Override
public String toString() {
	return "Studen [id=" + id + ", name=" + name + ", addrese=" + addrese + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddrese() {
	return addrese;
}
public void setAddrese(String addrese) {
	this.addrese = addrese;
}


	

}
