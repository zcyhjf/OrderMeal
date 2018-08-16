package com.hlju.tumblr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Goods {
	@Id
	@GeneratedValue
	private String gname;
	
	private String gsize;
	
	private String gcount;
	
	private Integer oprice;

	public Goods(String gname, String gsize, String gcount) {
		this.gname = gname;
		this.gsize = gsize;
		this.gcount = gcount;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGsize() {
		return gsize;
	}

	public void setGsize(String gsize) {
		this.gsize = gsize;
	}

	public String getGcount() {
		return gcount;
	}

	public void setGcount(String gcount) {
		this.gcount = gcount;
	}

	public Integer getOprice() {
		return oprice;
	}

	public void setOprice(Integer oprice) {
		this.oprice = oprice;
	}
	
	

}
