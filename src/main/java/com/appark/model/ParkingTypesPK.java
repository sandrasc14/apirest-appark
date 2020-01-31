package com.appark.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class ParkingTypesPK implements Serializable {

	@Basic(optional = false)
    @NotNull
    @Column(name = "parking_id")
    private int parkingId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vehicle_id")
    private int vehicleId;

    public ParkingTypesPK() {
    }

    public ParkingTypesPK(int parkingId, int vehicleId) {
        this.parkingId = parkingId;
        this.vehicleId = vehicleId;
    }
    
    public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (int) parkingId;
        hash += (int) vehicleId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParkingTypesPK)) {
            return false;
        }
        ParkingTypesPK other = (ParkingTypesPK) object;
        if (this.parkingId != other.parkingId) {
            return false;
        }
        if (this.vehicleId != other.vehicleId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ParkingTypesPK[ parking_id=" + parkingId + ", vehicle_id=" + vehicleId + " ]";
    }
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
}
