package com.appark.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="parkings")
public class Parking implements Serializable{
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@NotNull  
    protected String name; 
    
    protected Double score;

    @NotNull
    protected Double latitude;
    
    @NotNull
    protected Double longitude;

    @NotNull
    protected String address;

    @NotNull
    protected boolean accesibility;
    
    @NotNull
    protected Integer places;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parking")
    private List<Review> reviewsCollection;

	public Parking() {
		this.reviewsCollection = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isAccesibility() {
		return accesibility;
	}

	public void setAccesibility(boolean accesibility) {
		this.accesibility = accesibility;
	}

	public Integer getPlaces() {
		return places;
	}

	public void setPlaces(Integer places) {
		this.places = places;
	}

	public List<Review> getReviewsCollection() {
		return reviewsCollection;
	}

	public void setReviewsCollection(List<Review> reviewsCollection) {
		this.reviewsCollection = reviewsCollection;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
