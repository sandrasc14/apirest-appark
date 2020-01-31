package com.appark.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appark.model.Parking;

public interface IParkingRepo extends JpaRepository<Parking,Integer>{
	/*@Query("SELECT p FROM parkings p, parking_types pt, vehicles ve WHERE p.id = pt.parking_id AND ve.id = pt.vehicle_id AND p.ADDRESS = ?1 AND p.PLACES = ?2 AND p.NAME= ?3 AND ve.id= ?4 AND pt.price= ?5")
	public List<Parking> searchParking(String address, Integer places,
			String name, Integer idVehicle, Double price); */
}
