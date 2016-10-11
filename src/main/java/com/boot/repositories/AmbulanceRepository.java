package com.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entities.Ambulance;

public interface AmbulanceRepository extends JpaRepository<Ambulance,Integer> {


}
