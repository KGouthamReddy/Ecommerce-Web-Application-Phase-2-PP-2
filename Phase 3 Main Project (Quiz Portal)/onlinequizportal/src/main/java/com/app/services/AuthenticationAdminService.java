package com.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Admin;
import com.app.entity.User;
import com.app.exceptions.AdminNotFoundException;
import com.app.exceptions.UserNotFoundException;
import com.app.repositories.AuthenticationAdminRepository;
import com.app.repositories.AuthenticationUserRepository;

@Service
public class AuthenticationAdminService {
	
	@Autowired
	AuthenticationAdminRepository adminAuthRepo;

	
	public Admin GetAdminByName(String name) {
		Optional<Admin> adminfound = adminAuthRepo.findAdminByName(name);
		if(adminfound.isPresent()) {
			return adminfound.get();
		}
		else {
			throw new AdminNotFoundException();
		}
	}
	
	
	
	public Boolean isValidPassword(String cmp, String actual) {
		return ((cmp.equals(actual)) ?  true :  false);	
	}


	
	
	

}
