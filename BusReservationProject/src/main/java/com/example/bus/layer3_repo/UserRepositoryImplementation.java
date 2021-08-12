package com.example.bus.layer3_repo;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.bus.layer2_pojo.UserProfile;


@Repository
public class UserRepositoryImplementation extends BaseRepository implements UserRepository {

	@Transactional
	public void inserUserProfile(UserProfile user) {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		entityManager.persist(user);
		}

	@Transactional
	public boolean checkUserForLogin(String email,String password) {
		// TODO Auto-generated method stub
		boolean res=false;
		EntityManager entityManager = getEntityManager();
		UserProfile up=entityManager.find(UserProfile.class, email);
		if ( up!=null && up.getPassword().equals(password)) {
			res=true;
			
		}
		return res;		
	}
	
	
	

}
