package com.repository;



import java.util.List;

import com.entities.Flat;
import com.entities.FlatBooking;
import com.exception.FlatBookingNotFoundException;

public interface IFlatBookingRepository {
	public Flat addFlatBooking(FlatBooking flat) ;
	public Flat updateFlatBooking(Flat flat) throws FlatBookingNotFoundException;
	public Flat deleteFlatBooking(Flat flat) throws FlatBookingNotFoundException;
	public Flat viewFlatBooking(int id) throws FlatBookingNotFoundException;
	public List<FlatBooking> viewAllFlatBooking();
}
