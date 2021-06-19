package com.service;

import java.util.List;

import com.entities.Flat;
import com.exception.FlatNotFoundException;

public interface IFlatService {
	public Flat addFlat(Flat flat);
	public Flat updateFlat(Flat flat) throws FlatNotFoundException;
	public Flat deleteFlat(Flat flat) throws FlatNotFoundException;
	public Flat viewFlat(int id) throws FlatNotFoundException;
	public List<Flat> viewAllFlat();
	public List<Flat> viewAllFlatByCost(float cost,String availability);

}
