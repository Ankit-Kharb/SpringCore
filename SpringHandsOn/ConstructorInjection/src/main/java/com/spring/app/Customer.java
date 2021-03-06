package com.spring.app;

public class Customer {
    private int custId;
    private String custName;
    private String emailId;
    private long contactNo;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
    
	public Customer(int a,String b, String c, long d)
	{
		this.custId = a;
		this.custName= b;
		this.emailId = c;
		this.contactNo = d;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", emailId=" + emailId + ", contactNo="
				+ contactNo + "]";
	}
    
	 	  	    	    	     	      	 	
}
