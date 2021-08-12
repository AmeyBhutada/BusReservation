package com.example.bus.layer5_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.bus.layer2_pojo.BusJourneyDetails;
import com.example.bus.layer4_service.BusServiceImplementation;
import com.example.bus.layer4_service.UserServiceImplementation;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/bus")
public class BusController {
	
	
	@Autowired
	BusServiceImplementation busService;
	
	@PutMapping("/changeRoute")
	public boolean updateBusRoute(@RequestParam int journeyId,@RequestParam String source,@RequestParam String destination)
	{
		return busService.updatebusRoute(journeyId, source, destination);
	}
	
	@PostMapping("/addBus")
	public ResponseEntity addBus(@RequestBody BusJourneyDetails bus)
	{
		busService.addBusDetails(bus);
		return new ResponseEntity(HttpStatus.OK);
	}
	 
	
	
	
	

}
