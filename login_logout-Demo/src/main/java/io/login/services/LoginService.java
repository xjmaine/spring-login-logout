package io.login.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.login.domain.Login;
import io.login.domain.User;
import io.login.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepo;
	
	public Login login(String username, String password) {
		Login login = loginRepo.findByUsernameAndPassword(username, password);
		return login;
	}
}
