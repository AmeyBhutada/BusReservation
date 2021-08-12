package com.example.bus.layer4_service;

import org.springframework.stereotype.Service;

import com.example.bus.layer2_pojo.UserProfile;

@Service
public interface UserService {
	
	void inserUserProfile(UserProfile user);
	boolean checkUserForLogin(String email,String password);
	
	

}
