package com.poc.dao;

import com.poc.dev.Person;

public class BankAppDao {

public Person validateLogin(String username, String password){
		
		boolean loginStatus = false;
		Person objPerson = null;
		try{
			if((username!=null && !username.equals("")) && (password!=null && !password.equals(""))){
				if(username.equalsIgnoreCase("Akhil") && password.equalsIgnoreCase("akhil")){
					objPerson = new Person();
					loginStatus = true;
					objPerson.setLoginStatus(loginStatus);
					objPerson.setfName(username);
					objPerson.setlName("HADA");
					objPerson.setEmail("abc@tcs-demo.com");
					objPerson.setEmpId("123456");
					objPerson.setDepartment("IT");
					objPerson.setPhone("9876543210");
										
				}else{
					objPerson = new Person();
					loginStatus = false;
					objPerson.setLoginStatus(loginStatus);
					
				}
			}else{
				System.out.println("Username or password cannot be blank");
			}
			
		}catch(Exception e){
			System.out.println("Exception in Person:validateLogin :: "+e);
		}
		
		return objPerson;
	}
	
}
