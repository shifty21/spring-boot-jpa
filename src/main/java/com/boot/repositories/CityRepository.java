package com.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entities.City;

public interface CityRepository extends JpaRepository<City,Integer> {

}
