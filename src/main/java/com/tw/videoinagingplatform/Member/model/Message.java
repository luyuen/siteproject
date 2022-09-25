package com.tw.videoinagingplatform.Member.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "member")


public class Message implements Serializable {
	
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
@Id @Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@Column(name = "ACCOUNT")
	private String account;
	
	@Column(name = "HASHED_PWD")
	private String hashed_pwd;
	
	@Column(name = "MEMPIC")
	private String mempic;
	
	@Column(name = "FASTNAME")
	private String fastname;
	
	@Column(name = "LASTNAME")
	private String lastname;
	
	@Column(name = "GMAIL")
	private String gmail;
	
	@Column(name = "ADDRESS")
	private String address;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getHashed_pwd() {
		return hashed_pwd;
	}
	public void setHashed_pwd(String hashed_pwd) {
		this.hashed_pwd = hashed_pwd;
	}
	public String getMempic() {
		return mempic;
	}
	public void setMempic(String mempic) {
		this.mempic = mempic;
	}
	public String getFastname() {
		return fastname;
	}
	public void setFastname(String fastname) {
		this.fastname = fastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
