package com.hlju.tumblr.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue
    private Integer oid;

    private String oname;

    private Double oprice;//订单金额

    private String oaddress;//地址

    private Integer buystate = BuyerEnum.YPM.getCode();//支付状态

    private Integer ostate = OrderEnum.NEW.getCode();//订单状态

    private Date ocreatetime;

    private Date oupdatetime;
    
    private String productsdetail;
    
    private String note;//备注
    
    private String phone;
    
    private String pname;
    
    private String psize;
    
    private String pcount;
    
    
    
    
//鍒嗛〉  ----------------------
    
    private Integer size;   //姣忛〉鏄剧ず鐨勬潯鏁�
    
    private Integer currentPage;   //浠庣鍑犳潯鏁版嵁寮�濮嬬殑

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

	//鍒嗛〉  ----------------------
    
    public String getProductsdetail() {
		return productsdetail;
	}

	public void setProductsdetail(String productsdetail) {
		this.productsdetail = productsdetail;
	}



	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}



	public Date getOcreatetime() {
		return ocreatetime;
	}

	public void setOcreatetime(Date ocreatetime) {
		this.ocreatetime = ocreatetime;
	}

	public Date getOupdatetime() {
		return oupdatetime;
	}

	public void setOupdatetime(Date oupdatetime) {
		this.oupdatetime = oupdatetime;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public Double getOprice() {
		return oprice;
	}

	public void setOprice(Double oprice) {
		this.oprice = oprice;
	}

	public String getOaddress() {
		return oaddress;
	}

	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}

	public Integer getBuystate() {
		return buystate;
	}

	public void setBuystate(Integer buystate) {
		this.buystate = buystate;
	}

	public Integer getOstate() {
		return ostate;
	}

	public void setOstate(Integer ostate) {
		this.ostate = ostate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPsize() {
		return psize;
	}

	public void setPsize(String psize) {
		this.psize = psize;
	}

	public String getPcount() {
		return pcount;
	}

	public void setPcount(String pcount) {
		this.pcount = pcount;
	}
    
    public OrderEnum getOrderEnum(){
    	return OrderEnum.getOrderEnum(ostate);
    }
    
     public BuyerEnum getBuyerEnum(){
    	return BuyerEnum.getBuyerEnum(buystate);
    }
	
     public String getTime(){
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String str = sd.format(ocreatetime);
			return str;
    }
     
   

}