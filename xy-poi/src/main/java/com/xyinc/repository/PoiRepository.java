package com.xyinc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xyinc.model.Poi;

public interface PoiRepository extends JpaRepository<Poi, Long>{
	
}
