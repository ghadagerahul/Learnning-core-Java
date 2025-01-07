package com.spring.app.config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.spring.app.model.UserEnrollDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenHandler {

	private String secret = "J/nS5Vf2CfK/NZdem/xQ+yV4kPkGxwsqTgQT1MqQ+P0=";

	private int expirationKey = 1 * 60 * 60;

	public String doGenerateToken(Map<String, Object> claims, String username) {
		// TODO Auto-generated method stub
		String token = Jwts.builder().setClaims(claims).setSubject(username)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + expirationKey * 1000))
				.signWith(SignatureAlgorithm.HS256, secret).compact();

		System.out.println("JWT-token: " + token);
		return token;
	}

	// Chacking JWT token is expired or not
	public boolean isExpirationToken(String token) {

		Date date = getAllClaimsFromToken(token, Claims::getExpiration);
		return date.before(new Date());
	}

	// Returning Username from Token
	public String getUserNameFromJwtToken(String token) {

		String usernsme = getAllClaimsFromToken(token, Claims::getSubject);
		return usernsme;

	}

	// getting Claims Data from tocken & Input parameter into resolver
	public <T> T getAllClaimsFromToken(String token, Function<Claims, T> claimsResolver) {

		Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		return claimsResolver.apply(claims);
	}

	public static void main(String[] args) {
		new JwtTokenHandler().doGenerateToken(new HashMap<>(), "rahul");
	}

	public Boolean validateToken(String token, UserEnrollDetails user) {
		final String username = getUserNameFromJwtToken(token);
		return (username.equals(user.getUserNmae()) && !isExpirationToken(token));

	}

}
