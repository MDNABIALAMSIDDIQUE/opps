package com.dg.curd.IfrinedRepo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dg.curd.modal.Friends_info;

public interface Ifrined extends CrudRepository<Friends_info, Integer> {
	//Custum Method
public	List<Friends_info> findByName(String name);
public List<Friends_info>findByNameAndAddress(String name,String address);

}
