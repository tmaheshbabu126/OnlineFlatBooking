
package com.entities;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Landlord {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int landlordId;
	@NotNull
	private String landlordName;
	@NotNull
	@Min(18)
	private int landlordAge;
	
	 
	
	
	@OneToMany
	//(mappedBy = "flatId")
	//@JoinColumn(name="flatId")
	private  List<Flat> flatList ;
	
	public Landlord()
	{ 
		super();
	}

	public Landlord(int landlordId, String landlordName, int landlordAge) {
		super();
		this.landlordId = landlordId;
		this.landlordName = landlordName;
		this.landlordAge = landlordAge;
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

	@Override
	public String toString() {
		return "Landlord [landlordId=" + landlordId + ", landlordName=" + landlordName + ", landlordAge=" + landlordAge
				+ ", flatList=" + flatList + "]";
	}
	
	
	
	
	

}
