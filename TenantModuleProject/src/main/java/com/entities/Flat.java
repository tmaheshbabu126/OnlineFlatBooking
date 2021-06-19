package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Flat {
	
	
	
	
	
	@Id
	@GeneratedValue
	private int flatId;
	private float cost;
	@OneToOne
	//(mappedBy="tenant")
	@JoinColumn(name = "houseNo")
	private FlatAddress flatAddress;
	private String avialibilty;
	public Flat(int flatId, float cost, FlatAddress flatAddress, String avialibilty) {
		super();
		this.flatId = flatId;
		this.cost = cost;
		this.flatAddress = flatAddress;
		this.avialibilty = avialibilty;
	}
	public Flat() {
		super();
	}
	public int getFlatId() {
		return flatId;
	}
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public FlatAddress getFlatAddress() {
		return flatAddress;
	}
	public void setFlatAddress(FlatAddress flatAddress) {
		this.flatAddress = flatAddress;
	}
	public String getAvialibilty() {
		return avialibilty;
	}
	public void setAvialibilty(String avialibilty) {
		this.avialibilty = avialibilty;
	}
	
	
	
	
	
	
	
	
	
}