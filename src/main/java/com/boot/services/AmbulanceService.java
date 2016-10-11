package com.boot.services;

import java.util.List;

import com.boot.entities.Ambulance;
import com.boot.forms.AmbulanceForm;

public interface AmbulanceService {
	
	List<Ambulance> findAll();

	Ambulance addNewAmbulanceData(AmbulanceForm ambulanceform);
	void deleteAmbulance(int id);
	
}
