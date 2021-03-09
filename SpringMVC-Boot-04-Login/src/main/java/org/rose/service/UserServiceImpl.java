package org.rose.service;

import org.rose.model.User;
import org.rose.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public String checkCredentials(User user) {
		int result = userRepo.isAvailable(user.getUsername(), user.getPassword());
		return (result == 0) ? "Invalid Credentials" : "Valid Credentials";
	}

}
