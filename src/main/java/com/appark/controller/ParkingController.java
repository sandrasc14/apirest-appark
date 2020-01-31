package com.appark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appark.model.Parking;
import com.appark.service.IParkingService;

@CrossOrigin(origins = { "https://apparkclient.firebaseapp.com"})
@RestController
@RequestMapping("/parkings")
public class ParkingController {

	@Autowired
	private IParkingService service;

	@PostMapping
	public Parking registrar(@RequestBody Parking obj) {
		return service.registrar(obj);
	}

	@PutMapping()
	public Parking modificar(@RequestBody Parking obj) {
		return service.modificar(obj);
	}

	@GetMapping
	public List<Parking> listar() {
		return service.listar();
	}

	@GetMapping("/{id}")
	public Parking listarById(@PathVariable Integer id) {
		return service.listarPorId(id);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}

/*	@GetMapping("/{address}/{places}/{name}/{idVehicle}/{price}")
	public List<Parking> searchParking(@PathVariable String address,@PathVariable Integer places,
			@PathVariable String name,@PathVariable Integer idVehicle,@PathVariable Double price) {
		return (List<Parking>) service.searchParking(address, places, name, idVehicle, price);
	}*/

}
