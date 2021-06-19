package com.service;

import java.util.List;

import com.advice.LandlordNotFoundException;
import com.entities.Landlord;

public interface ILandlordService {
	public Landlord addLandlord(Landlord landlord);
	public Landlord updateLandlord(Landlord landlord) throws LandlordNotFoundException;
	public Landlord deleteLandlord(Landlord landlord) throws LandlordNotFoundException;
	public Landlord viewLandlord(int id) throws LandlordNotFoundException;
	public List<Landlord> viewAllLandlord();
}
