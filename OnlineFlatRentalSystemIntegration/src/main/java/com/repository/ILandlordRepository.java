package com.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.advice.LandlordNotFoundException;
import com.entities.Landlord;

@Repository
public interface ILandlordRepository {

	public Landlord addLandlord(Landlord landlord);
	public Landlord updateLandlord(Landlord landlord) throws LandlordNotFoundException;
	public Landlord deleteLandlord(Landlord landlord) throws LandlordNotFoundException;
	public Landlord viewLandlord(int id) throws LandlordNotFoundException;
	public List<Landlord> viewAllLandlord();

}
