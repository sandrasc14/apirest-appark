package com.appark.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="parkingTypes")
public class ParkingTypes implements Serializable{
  
	@EmbeddedId
	protected ParkingTypesPK parkingTypesPK;
	
	@NotNull
    private short price;
	 
    @JoinColumn(name = "parking_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Parking parking;
    
    @JoinColumn(name = "vehicle_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vehicle vehicle;
    
  
    public ParkingTypes() {
    }

	public ParkingTypesPK getParkingTypesPK() {
		return parkingTypesPK;
	}

	public void setParkingTypesPK(ParkingTypesPK parkingTypesPK) {
		this.parkingTypesPK = parkingTypesPK;
	}

	public short getPrice() {
		return price;
	}

	public void setPrice(short price) {
		this.price = price;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
