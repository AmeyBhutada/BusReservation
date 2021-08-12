package com.example.bus.layer3_repo;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.bus.layer2_pojo.BusJourneyDetails;

@Repository
public class BusRepositoryImplementation extends BaseRepository  implements BusRepository{


	@Transactional 
	
	public boolean updatebusRoute(int journeyId, String source, String destination) {
		// TODO Auto-generated method stub
		boolean res=false;
		EntityManager entityManager = getEntityManager();
		BusJourneyDetails busJourneyDetails=entityManager.find(BusJourneyDetails.class, journeyId );
		if (busJourneyDetails!=null)
		{
			busJourneyDetails.setSource_loc(source);
			busJourneyDetails.setDestination_loc(destination);
			entityManager.persist(busJourneyDetails);	
			res=true;
		}
		return res;
	}

	@Transactional 
	public void addBusDetails(BusJourneyDetails bus) {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		entityManager.persist(bus);				
	}
	
	

}
