package com.hlju.tumblr.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Product {
	
	@Id
	@GeneratedValue
    private Integer pid;

    private String pname;

    private Double pprice;

    private Integer pstock;

    private String pdescription;

    private String pimg;

    private Integer pstatus;

    private Integer ctype;

    private Date pcreatetime;

    private Date pupdatetime;

    private Integer isdel;
    
    private Integer sid;
    
    private String cname;
    
    private String psize;
    
    private Integer pcount;
    
    
    //分页  ----------------------
    
    private Integer size;   //每页显示的条数
    
    private Integer currentPage;   //从第几条数据开始的

    public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	//分页  ----------------------

    public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public Integer getPstock() {
        return pstock;
    }

    public void setPstock(Integer pstock) {
        this.pstock = pstock;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription == null ? null : pdescription.trim();
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg == null ? null : pimg.trim();
    }

    public Integer getPstatus() {
        return pstatus;
    }

    public void setPstatus(Integer pstatus) {
        this.pstatus = pstatus;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public Date getPcreatetime() {
        return pcreatetime;
    }

    public void setPcreatetime(Date pcreatetime) {
        this.pcreatetime = pcreatetime;
    }

    public Date getPupdatetime() {
        return pupdatetime;
    }

    public void setPupdatetime(Date pupdatetime) {
        this.pupdatetime = pupdatetime;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getPsize() {
		return psize;
	}

	public void setPsize(String psize) {
		this.psize = psize;
	}

	public Integer getPcount() {
		return pcount;
	}

	public void setPcount(Integer pcount) {
		this.pcount = pcount;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pstock=" + pstock
				+ ", pdescription=" + pdescription + ", pimg=" + pimg + ", pstatus=" + pstatus + ", ctype=" + ctype
				+ ", pcreatetime=" + pcreatetime + ", pupdatetime=" + pupdatetime + ", isdel=" + isdel + ", sid=" + sid
				+ ", cname=" + cname + ", psize=" + psize + ", pcount=" + pcount + ", size=" + size + ", currentPage="
				+ currentPage + "]";
	}

	
}