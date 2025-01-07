package com.spring.app.repoimpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.model.UserEnrollDetails;
import com.spring.app.repo.AbstractRepo;

@Service
public class AbstractRepoImpl {

//	@Autowired
//	private AbstractRepo repo;
//
//	public Optional<UserEnrollDetails> findById(String id) {
//		Optional<UserEnrollDetails> user = repo.findById(id);
//		return Optional.ofNullable(user.get());
//	}
//
//	public boolean saveUserDetails(UserEnrollDetails userDetails) {
//		UserEnrollDetails status = repo.save(userDetails);
//		return null != status ? true : false;
//
//	}

}
