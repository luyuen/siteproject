package com.tw.videoinagingplatform.Forum.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Forum")
public class Forum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FORUM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fourm_id;
	
	@Column(name = "FORUM_DATETIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String forum_datetime;
	
	@Column(name = "FORUM_UPDATETIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String forum_updatetime;
	
	@Column(name = "FORUM_MEMPIC")
	private String forum_mempic;
	
	@Column(name = "FORUM_CONTENT")
	private String forum_content;

	
	public int getFourm_id() {
		return fourm_id;
	}

	public void setFourm_id(int fourm_id) {
		this.fourm_id = fourm_id;
	}

	public String getForum_datetime() {
		return forum_datetime;
	}

	public void setForum_datetime(String forum_datetime) {
		this.forum_datetime = forum_datetime;
	}

	public String getForum_updatetime() {
		return forum_updatetime;
	}

	public void setForum_updatetime(String forum_updatetime) {
		this.forum_updatetime = forum_updatetime;
	}

	public String getForum_mempic() {
		return forum_mempic;
	}

	public void setForum_mempic(String forum_mempic) {
		this.forum_mempic = forum_mempic;
	}

	public String getForum_content() {
		return forum_content;
	}

	public void setForum_content(String forum_content) {
		this.forum_content = forum_content;
	}
	
	
	
}
