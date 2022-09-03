package com.app.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Admin;
import com.app.entity.User;

@Repository
public interface AuthenticationUserRepository extends CrudRepository<User, Integer>{
	
	public Optional<User> findUserByName(String name);

	public Admin save(Admin admin);

}
