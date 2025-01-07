package com.spring.app.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PORTAL_USERS")
public class UserEnrollDetails {

	
	private Long userId;

	@Id
	private String userNmae;

	private String userpasssword;

	private String userEmailAddress;

	private String userContactNumber;

	private String userAddress;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNmae() {
		return userNmae;
	}

	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
	}

	public String getUserpasssword() {
		return userpasssword;
	}

	public void setUserpasssword(String userpasssword) {
		this.userpasssword = userpasssword;
	}

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	public String getUserContactNumber() {
		return userContactNumber;
	}

	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userNmae=" + userNmae + ", userpasssword=" + userpasssword
				+ ", userEmailAddress=" + userEmailAddress + ", userContactNumber=" + userContactNumber
				+ ", userAddress=" + userAddress + "]";
	}

}
