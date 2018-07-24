package com.gov.notice.gov_notice.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="gov_notice")
public class GovNotice {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
    
	
    private  String notice_title;
   
	@Column(name="notice_date")
    private  LocalDateTime notice_date;
   
	
    private  String detail_url;
   
	
    private  String area_code;
   
	
    private  String content_type;
   
	
    private  Integer publish_id;
   
	
    private  Integer thing_type_id;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNotice_title() {
		return notice_title;
	}


	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public LocalDateTime getNotice_date() {
		return notice_date;
	}


	public void setNotice_date(LocalDateTime notice_date) {
		this.notice_date = notice_date;
	}


	public String getDetail_url() {
		return detail_url;
	}


	public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	}


	public String getArea_code() {
		return area_code;
	}


	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}


	public String getContent_type() {
		return content_type;
	}


	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}


	public Integer getPublish_id() {
		return publish_id;
	}


	public void setPublish_id(Integer publish_id) {
		this.publish_id = publish_id;
	}


	public Integer getThing_type_id() {
		return thing_type_id;
	}


	public void setThing_type_id(Integer thing_type_id) {
		this.thing_type_id = thing_type_id;
	}
    
    

}
