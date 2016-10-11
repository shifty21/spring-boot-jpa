package com.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entities.City;
import com.boot.repositories.CityRepository;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	CityRepository cityrepo;
	
	@Override
	public List<City> getCity() {
		return cityrepo.findAll();
	}

}
