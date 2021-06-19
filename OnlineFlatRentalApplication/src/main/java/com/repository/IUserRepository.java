package com.repository;

import java.util.List;

import com.entities.UserOne;
import com.exception.UserNotFoundException;

public interface IUserRepository {
	public UserOne viewUserOne(int id) throws UserNotFoundException;
	public List<UserOne> viewAllUserOne();
	public UserOne validateUserOne(String UserOnename,String password) throws UserNotFoundException;
	public UserOne addUserOne(UserOne UserOne);
	public UserOne updateUserOne(UserOne UserOne);
	public UserOne updatePassword(UserOne UserOne,String newpass);
	public UserOne removeUserOne(UserOne UserOne);
	

}
