package com.example.bus.layer3_repo;

import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository {
	boolean checkAdminForLogin(String email,String password);

}
