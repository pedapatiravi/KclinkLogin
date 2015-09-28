package com.infy.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class UserEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	@Id
	@Column(name = "user_id",insertable=false,updatable=false)
	private Long userid;
	
	
	@Column(name="user_name")
	private String user_name;
	@Column(name="user_password")
	private String user_password;
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	
	
	

}
