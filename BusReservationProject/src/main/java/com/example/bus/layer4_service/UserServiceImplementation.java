package com.example.bus.layer4_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bus.layer2_pojo.UserProfile;
import com.example.bus.layer3_repo.UserRepositoryImplementation;


@Service
public class UserServiceImplementation implements UserService {

	
	
	@Autowired
	UserRepositoryImplementation userRepoImpl;
	
	
	@Override
	public void inserUserProfile(UserProfile user) {
		// TODO Auto-generated method stub
		userRepoImpl.inserUserProfile(user);
	}

	@Override
	public boolean checkUserForLogin(String email,String password) {
		// TODO Auto-generated method stub
		return userRepoImpl.checkUserForLogin(email,password);
	}

}
