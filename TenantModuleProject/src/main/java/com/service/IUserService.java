package com.service;

import java.util.List;

import com.advice.UserNotFoundException;
import com.entities.User;

public interface IUserService {
	public User viewUser(int id) throws UserNotFoundException;
	public List<User> viewAllUser();
	public User validateUser(String username,String password) throws UserNotFoundException;
	public User addUser(User user);
	public User updateUser(User user);
	public User updatePassword(User user,String newpass);
	public User removeUser(User user);
}
