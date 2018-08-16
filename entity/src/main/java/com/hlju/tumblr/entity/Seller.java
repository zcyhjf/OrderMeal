package com.hlju.tumblr.entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Seller {
	
	@Id
	@GeneratedValue
    private Integer sid;

    private String susername;

    private String spwd;

    private String sname;

    private String stel;

    private String saddress;

    private Integer smonthsale;

    private String sinfo;

    private String sopen;

    private String simg;

    private Integer isdel;

    private String sopenid;

    private Date screatetime;

    private Date supdatetime;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSusername() {
        return susername;
    }

    public void setSusername(String susername) {
        this.susername = susername == null ? null : susername.trim();
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd == null ? null : spwd.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel == null ? null : stel.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public Integer getSmonthsale() {
        return smonthsale;
    }

    public void setSmonthsale(Integer smonthsale) {
        this.smonthsale = smonthsale;
    }

    public String getSinfo() {
        return sinfo;
    }

    public void setSinfo(String sinfo) {
        this.sinfo = sinfo == null ? null : sinfo.trim();
    }

    public String getSopen() {
        return sopen;
    }

    public void setSopen(String sopen) {
        this.sopen = sopen == null ? null : sopen.trim();
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg == null ? null : simg.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public String getSopenid() {
        return sopenid;
    }

    public void setSopenid(String sopenid) {
        this.sopenid = sopenid == null ? null : sopenid.trim();
    }

    public Date getScreatetime() {
        return screatetime;
    }

    public void setScreatetime(Date screatetime) {
        this.screatetime = screatetime;
    }

    public Date getSupdatetime() {
        return supdatetime;
    }

    public void setSupdatetime(Date supdatetime) {
        this.supdatetime = supdatetime;
    }

}