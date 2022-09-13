package com.tw.videoinagingplatform.Opus.model;

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
@Table(name = "opus")
public class Opus implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OPUS")
	private int opus_id;
	
	@Column(name = "OPUS_MEMBER")
	private String opus_Member;

	@Column(name = "OPUS_DATETIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String opus_datetime;

	@Column(name = "OPUS_UPDATETIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String opus_updatetime;
	
	@Column(name = "opus_audiofile")
	private String opus_audiofile;

	@Column(name = "OPUS_IMAGE")
	private String opus_image;

	@Column(name = "OPUS_PERMISSIONS")
	private String opus_permissions;

	public int getOpus_id() {
		return opus_id;
	}

	public void setOpus_id(int opus_id) {
		this.opus_id = opus_id;
	}

	public String getOpus_Member() {
		return opus_Member;
	}

	public void setOpus_Member(String opus_Member) {
		this.opus_Member = opus_Member;
	}

	public String getOpus_datetime() {
		return opus_datetime;
	}

	public void setOpus_datetime(String opus_datetime) {
		this.opus_datetime = opus_datetime;
	}

	public String getOpus_updatetime() {
		return opus_updatetime;
	}

	public void setOpus_updatetime(String opus_updatetime) {
		this.opus_updatetime = opus_updatetime;
	}

	public String getOpus_audiofile() {
		return opus_audiofile;
	}

	public void setOpus_audiofile(String opus_audiofile) {
		this.opus_audiofile = opus_audiofile;
	}

	public String getOpus_image() {
		return opus_image;
	}

	public void setOpus_image(String opus_image) {
		this.opus_image = opus_image;
	}

	public String getOpus_permissions() {
		return opus_permissions;
	}

	public void setOpus_permissions(String opus_permissions) {
		this.opus_permissions = opus_permissions;
	}

}
