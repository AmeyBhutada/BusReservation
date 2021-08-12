package com.example.bus.layer3_repo;

import org.springframework.stereotype.Repository;

import com.example.bus.layer2_pojo.BusJourneyDetails;

@Repository
public interface BusRepository {
	
	boolean updatebusRoute(int journeyid,String source,String destination);
	void addBusDetails(BusJourneyDetails bus);

}
