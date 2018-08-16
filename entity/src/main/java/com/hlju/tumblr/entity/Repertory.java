package com.hlju.tumblr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Repertory {

	@Id
	@GeneratedValue
	private Integer rid;
	
	private Integer pid;
	
	private String size;
	
	private Integer rcount;
	
	private Double rprice;

	public Double getRprice() {
		return rprice;
	}

	public void setRprice(Double rprice) {
		this.rprice = rprice;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getRcount() {
		return rcount;
	}

	public void setRcount(Integer rcount) {
		this.rcount = rcount;
	}

}
