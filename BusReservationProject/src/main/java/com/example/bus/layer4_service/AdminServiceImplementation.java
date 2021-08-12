package com.example.bus.layer4_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bus.layer3_repo.AdminRepositoryImplementation;

@Service
public class AdminServiceImplementation implements AdminService{

	
	@Autowired
	AdminRepositoryImplementation adminRepoImpl;
	
	@Override
	public boolean checkAdminForLogin(String email, String password) {
		// TODO Auto-generated method stub
		return  adminRepoImpl.checkAdminForLogin(email, password);
	}

}
