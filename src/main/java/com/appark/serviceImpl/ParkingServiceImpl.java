package com.appark.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appark.model.Parking;
import com.appark.repo.IParkingRepo;
import com.appark.service.IParkingService;

@Service
public class ParkingServiceImpl implements IParkingService{

	@Autowired
	private IParkingRepo repo;
	
	@Override
	public Parking registrar(Parking obj) {
		return repo.save(obj);
	}

	@Override
	public Parking modificar(Parking obj) {
		return repo.save(obj);
	}

	@Override
	public List<Parking> listar() {
		return repo.findAll();
	}

	@Override
	public Parking listarPorId(Integer id) {
		Optional<Parking> op= repo.findById(id);
		return op.isPresent()? op.get() : new Parking();	
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	/*@Override
	@Transactional(readOnly=true)
	public List<Parking> searchParking(String address, Integer places,String name, 
			Integer idVehicle, Double price) {
		 
		return repo.searchParking(address, places, name, idVehicle, price);
	} */
}
