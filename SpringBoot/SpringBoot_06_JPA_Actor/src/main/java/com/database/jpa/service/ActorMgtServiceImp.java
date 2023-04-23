package com.database.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.jpa.entity.ActorData;
import com.database.jpa.repository.IActorRepository;

@Service("Actorservice")
public class ActorMgtServiceImp implements IActorMgtService {
	
	@Autowired
	private IActorRepository iActorRepository;
	
	@Override
	public String registerActor(ActorData actorData) {
		ActorData sActorData=iActorRepository.save(actorData);
		return "Actor is registered with  id Value.."+sActorData.getAid();
	}

}
