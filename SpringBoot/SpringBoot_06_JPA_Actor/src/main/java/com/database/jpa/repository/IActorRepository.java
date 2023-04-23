package com.database.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.database.jpa.entity.ActorData;

public interface IActorRepository extends CrudRepository<ActorData, Integer> {
	
}
