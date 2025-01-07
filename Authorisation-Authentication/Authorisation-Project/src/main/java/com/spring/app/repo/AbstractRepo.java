package com.spring.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.spring.app.model.UserEnrollDetails;

@Repository
@EnableJpaRepositories
public interface AbstractRepo extends JpaRepository<UserEnrollDetails, String> {

}
