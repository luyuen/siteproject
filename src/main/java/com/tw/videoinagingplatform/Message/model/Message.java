package com.tw.videoinagingplatform.Message.model;

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
@Table(name = "MESAGE")
public class Message implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name = "MESSAGE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int message_id;
	
	@Column(name = "MESSAGE_DATETIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String message_datetime;
	
	@Column(name = "MEESAGE_UPDATETIME")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String message_updatetime;
	
	@Column(name = "MESSAGE_MEMPIC")
	private String message_mempic;
	
	@Column(name = "MESSAGE_CONTENT")
	private String message_content;

	
	public int getMessage_id() {
		return message_id;
	}

	public void setMessage_id(int message_id) {
		this.message_id = message_id;
	}

	public String getMessage_datetime() {
		return message_datetime;
	}

	public void setMessage_datetime(String message_datetime) {
		this.message_datetime = message_datetime;
	}

	public String getMessage_updatetime() {
		return message_updatetime;
	}

	public void setMessage_updatetime(String message_updatetime) {
		this.message_updatetime = message_updatetime;
	}

	public String getMessage_mempic() {
		return message_mempic;
	}

	public void setMessage_mempic(String message_mempic) {
		this.message_mempic = message_mempic;
	}

	public String getMessage_contentString() {
		return message_content;
	}

	public void setMessage_contentString(String message_contentString) {
		this.message_content = message_contentString;
	}
	
}
