package com.poc.dev;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	public boolean loginStatus;
	public String fName;
	public String lName;
	public String email ;
	public String phone;
	public String department;
	public String empId;
	
	public Person(){} 
	   
	public Person (String fName,String lName,String email,String phone, String department, String empId){
	      this.fName = fName;
	      this.lName =  lName;
	      this.email=email;
	      this.phone=phone;
	      this.department=department;
	      this.empId=empId;
	   }
	
	
	public boolean isLoginStatus() {
		return loginStatus;
	}
	
	@XmlElement
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getfName() {
		return fName;
	}
	
	@XmlElement
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	
	@XmlElement
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	
	@XmlElement
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	
	@XmlElement
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmpId() {
		return empId;
	}
	
	@XmlElement
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
