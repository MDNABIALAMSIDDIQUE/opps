package com.dg.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.dg.jpa.modal.UserModal;

public interface IUserRepo extends CrudRepository<UserModal, Integer> {

}
