package com.boot.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entities.Ambulance;
import com.boot.entities.City;
import com.boot.forms.AmbulanceForm;
import com.boot.repositories.AmbulanceRepository;
import com.boot.repositories.CityRepository;

@Service
public class AmbulanceServiceImpl implements AmbulanceService {
	
	@Autowired private AmbulanceRepository ambulanceRepository;
	@Autowired private CityRepository cityrepo;
	@Override
	public List<Ambulance> findAll() {
		return ambulanceRepository.findAll();
	}

	@Override
	public Ambulance addNewAmbulanceData(AmbulanceForm ambulanceform) {
		City city = cityrepo.findOne((Integer) ambulanceform.getCityid());
		Ambulance amb = new Ambulance();
		amb.setCreatedDate(new Date());
		amb.setAddress(ambulanceform.getAddress());
		amb.setAmbulanceName(ambulanceform.getAmbulanceName());
		amb.setCitydim(city);
		amb.setContact1(ambulanceform.getContact1());
		amb.setContact2(ambulanceform.getContact2());
		amb.setContact3(ambulanceform.getContact3());
		return ambulanceRepository.saveAndFlush(amb);
	}

	@Override
	public void deleteAmbulance(int id) {
		ambulanceRepository.delete(id);
		
	}


}
