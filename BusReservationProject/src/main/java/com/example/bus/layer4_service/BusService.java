package com.example.bus.layer4_service;

import org.springframework.stereotype.Service;

import com.example.bus.layer2_pojo.BusJourneyDetails;


@Service
public interface BusService {
	boolean updatebusRoute(int journeyid,String source,String destination);
	void addBusDetails(BusJourneyDetails bus);

}
