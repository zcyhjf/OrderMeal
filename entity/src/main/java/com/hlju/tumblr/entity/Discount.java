package com.hlju.tumblr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Discount {
	
	@Id
	@GeneratedValue
    private Integer discountid;

    private Integer full;

    private Integer reduce;
    
    private Integer sid;

    public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getDiscountid() {
        return discountid;
    }

    public void setDiscountid(Integer discountid) {
        this.discountid = discountid;
    }

	public Integer getFull() {
		return full;
	}

	public void setFull(Integer full) {
		this.full = full;
	}

	public Integer getReduce() {
		return reduce;
	}

	public void setReduce(Integer reduce) {
		this.reduce = reduce;
	}

   
}