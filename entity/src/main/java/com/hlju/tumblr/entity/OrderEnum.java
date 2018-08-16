package com.hlju.tumblr.entity;


public enum OrderEnum {
	
	NEW(0,"新订单"),FINISHED(1,"完结"),CANCLE(2,"已取消");
	
	private Integer code;
	private String message;
	
	private OrderEnum(Integer code,String message) {
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
	
	   public static OrderEnum getOrderEnum(Integer code){
	    	
		   for (OrderEnum orderEnum : OrderEnum.values()) {
			   if(orderEnum.getCode().equals(code)){
				   return orderEnum;
			   }
		}
		    return null;
	   }
		
	
	


	
	

}
