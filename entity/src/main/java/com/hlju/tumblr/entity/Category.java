package com.hlju.tumblr.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.ImportResource;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
    private Integer categoryid;

    private String cname;

    private Integer ctype;

    private String ccreatetime;

    private String cupdatetime;

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCtype() {
		return ctype;
	}

	public void setCtype(Integer ctype) {
		this.ctype = ctype;
	}

	public String getCcreatetime() {
		return ccreatetime;
	}

	public void setCcreatetime(String ccreatetime) {
		this.ccreatetime = ccreatetime;
	}

	public String getCupdatetime() {
		return cupdatetime;
	}

	public void setCupdatetime(String cupdatetime) {
		this.cupdatetime = cupdatetime;
	}

}