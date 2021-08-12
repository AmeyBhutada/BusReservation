package com.example.bus.layer3_repo;

import org.springframework.stereotype.Repository;

import com.example.bus.layer2_pojo.UserProfile;

@Repository
public interface UserRepository {
	
	void inserUserProfile(UserProfile user);
	boolean checkUserForLogin(String email,String password);
	
	

}
