package com.hlju.tumblr.entity;

public enum BuyerEnum {
	
	YPM(1,"未支付"),NPM(2,"已支付");
	
	private Integer code;
	private String message;
	
	private BuyerEnum(Integer code,String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	   public static BuyerEnum getBuyerEnum(Integer code){
	    	
		   for (BuyerEnum buyerEnum : BuyerEnum.values()) {
			   if(buyerEnum.getCode().equals(code)){
				   return buyerEnum;
			   }
		}
		    return null;
	   }
	
	


}
