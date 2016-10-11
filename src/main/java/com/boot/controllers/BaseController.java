package com.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entities.Ambulance;
import com.boot.entities.City;
import com.boot.forms.AmbulanceForm;
import com.boot.services.AmbulanceService;
import com.boot.services.CityService;
import com.boot.util.JSONResponse;

@RestController
public class BaseController {
	
	private AmbulanceService ambuService;
	
	private CityService cityService;
	
	
	@Autowired
	public void setAmbulanceService(AmbulanceService ambuService) {
		this.ambuService = ambuService;
	}
	
	@Autowired
	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}
	
	@RequestMapping(value="/")
	public String contact() {
		return "Hello world";
	}
	
	@RequestMapping(value="ambulance",method=RequestMethod.GET)
	public List<Ambulance> getAmbulanceDate() {
		return ambuService.findAll();
	}
	
	@RequestMapping(value="ambulance/{id}",method=RequestMethod.DELETE)
	public JSONResponse deleteAmbulance(@PathVariable int id) {
		System.out.println(id + " id value ");
		ambuService.deleteAmbulance(id);
		JSONResponse response = new JSONResponse();
		return response;
	}
	@RequestMapping(value="ambulance",method=RequestMethod.POST)
	public @ResponseBody JSONResponse addAmbulance(@RequestBody AmbulanceForm ambulanceform) {
		Ambulance s = ambuService.addNewAmbulanceData(ambulanceform);
		JSONResponse res = new JSONResponse();
		res.setData(s);
		return res;
	}
	
	@RequestMapping(value="allcities",method=RequestMethod.GET)
	public List<City> getCity() {
		return cityService.getCity();
	}
}
