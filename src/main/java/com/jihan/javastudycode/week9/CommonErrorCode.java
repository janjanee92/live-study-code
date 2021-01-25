package com.jihan.javastudycode.week9;

public enum CommonErrorCode implements ErrorCode {

	COMMON_ERROR("error.common"),
	;
	
	private String msgCode;
	
	private CommonErrorCode(String msgCode) {
		this.msgCode = msgCode;
	}

	@Override
	public String getCode() {
		return this.name();
	}
	
	@Override
	public String getMsgCode() {
		return msgCode;
	}

	@Override
	public boolean isEqual(String code) {
		return this.getCode().equals(code);
	}
	
	@Override
	public boolean isEqual(ErrorCode errorCode) {
		return this.isEqual(errorCode.getCode());
	}

}
