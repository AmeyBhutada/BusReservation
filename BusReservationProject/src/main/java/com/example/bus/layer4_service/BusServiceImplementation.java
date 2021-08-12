package com.example.bus.layer4_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bus.layer2_pojo.BusJourneyDetails;
import com.example.bus.layer3_repo.BusRepositoryImplementation;
import com.example.bus.layer3_repo.UserRepositoryImplementation;

@Service
public class BusServiceImplementation implements BusService {
	
	@Autowired
	BusRepositoryImplementation busRepoImpl;

	@Override
	public boolean updatebusRoute(int journeyid, String source, String destination) {
		// TODO Auto-generated method stub
		return busRepoImpl.updatebusRoute(journeyid, source, destination);
	}

	@Override
	public void addBusDetails(BusJourneyDetails bus) {
		// TODO Auto-generated method stub
		busRepoImpl.addBusDetails(bus);
		
	}

}
