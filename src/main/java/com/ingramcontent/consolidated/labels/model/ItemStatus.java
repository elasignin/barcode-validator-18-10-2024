package com.ingramcontent.consolidated.labels.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ItemStatus implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String messageCode;

	private boolean success;

	public ItemStatus() {
	}

	public java.lang.String getMessageCode() {
		return this.messageCode;
	}

	public void setMessageCode(java.lang.String messageCode) {
		this.messageCode = messageCode;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ItemStatus(java.lang.String messageCode, boolean success) {
		this.messageCode = messageCode;
		this.success = success;
	}

}