package com.spring.app.repoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.app.repo.AbstractRepo;

public class UserdetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AbstractRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return (UserDetails) repo.findById(username).get();
	}

}
