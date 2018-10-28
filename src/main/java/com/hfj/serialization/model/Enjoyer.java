package com.hfj.serialization.model;

import java.io.Serializable;
/**
 * @author HFJ
 *
 */
public class Enjoyer implements Serializable {

	private static final long serialVersionUID = -6353706959134909487L;

	private String yourName;
	private Long mobileNumber;
	private String yourGirlFriendName;
	/*
	 * Making GF number as transient for security (if we don’t want to save
	 * value)
	 * 
	 * test with transient and without transient to check difference
	 */
	transient private Long yourGirlFriendMobileNumber;

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getYourGirlFriendName() {
		return yourGirlFriendName;
	}

	public void setYourGirlFriendName(String yourGirlFriendName) {
		this.yourGirlFriendName = yourGirlFriendName;
	}

	public Long getYourGirlFriendMobileNumber() {
		return yourGirlFriendMobileNumber;
	}

	public void setYourGirlFriendMobileNumber(Long yourGirlFriendMobileNumber) {
		this.yourGirlFriendMobileNumber = yourGirlFriendMobileNumber;
	}

	public Enjoyer(String yourName, Long mobileNumber, String yourGirlFriendName, Long yourGirlFriendMobileNumber) {
		super();
		this.yourName = yourName;
		this.mobileNumber = mobileNumber;
		this.yourGirlFriendName = yourGirlFriendName;
		this.yourGirlFriendMobileNumber = yourGirlFriendMobileNumber;
	}

	public Enjoyer() {
	}

}
