package com.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Landlord {
	@Id
	@GeneratedValue
	private int landlordId;
	private String landlordName;
	private int  landlordAge;
	@OneToMany
	@JoinColumn(name = "flatId")

	private List<Flat> flatList;
	
	
	public Landlord(int landlordId, String landlordName, int landlordAge, List<Flat> flatList) {
		super();
		this.landlordId = landlordId;
		this.landlordName = landlordName;
		this.landlordAge = landlordAge;
		this.flatList = flatList;
	}
	public int getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}
	public String getLandlordName() {
		return landlordName;
	}
	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}
	public int getLandlordAge() {
		return landlordAge;
	}
	public void setLandlordAge(int landlordAge) {
		this.landlordAge = landlordAge;
	}
	public List<Flat> getFlatList() {
		return flatList;
	}
	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}
	@Override
	public String toString() {
		return "Landlord [landlordId=" + landlordId + ", landlordName=" + landlordName + ", landlordAge=" + landlordAge
				+ "]";
	}
	
	

}
