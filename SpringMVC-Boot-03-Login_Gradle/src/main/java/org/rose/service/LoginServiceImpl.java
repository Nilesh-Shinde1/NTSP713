package org.rose.service;

import org.rose.model.User;
import org.rose.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private UserRepo repo;

	@Override
	public String checkValidations(User user) {
		return (repo.checkCredentials(user.getUsername(), user.getPassword()) == 0 )? "Invalid Credentials" : "Valid Credentials";
	}

}
