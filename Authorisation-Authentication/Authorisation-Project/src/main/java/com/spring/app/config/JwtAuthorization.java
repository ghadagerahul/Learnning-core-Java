package com.spring.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@Component
@EnableWebSecurity
public class JwtAuthorization {

	@Autowired
	private JwtAuthenticationEntryPoint point;

	@Autowired
	private JwtAuthorizationFilter filter;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.csrf().disable()
				.authorizeHttpRequests(ar -> ar.requestMatchers("/admin/**").permitAll().anyRequest().authenticated());

		http.exceptionHandling(ex -> ex.authenticationEntryPoint(point));

		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

		return http.build();

	}
	
	  
}
