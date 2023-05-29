package com.smart.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.modal.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
