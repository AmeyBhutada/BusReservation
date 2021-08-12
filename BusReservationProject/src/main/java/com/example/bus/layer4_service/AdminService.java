package com.example.bus.layer4_service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {
	boolean checkAdminForLogin(String email,String password);

}
