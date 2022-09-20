package com.email.main;

import com.email.model.Department;
import com.email.service.CredentialServices;
public class Main {
	public static String GL;
	private static String firstName;
	private static String lastName;
	public static String CompanyName = GL;
	public static String deptName;
	public int EmailAddress;
	
	
	public static void main(String[] args) {
		Department dept = new Department();
		dept.insertDept();
		CredentialServices email = new CredentialServices(firstName, lastName, deptName, CompanyName);
	
			CredentialServices.setFirstName("subham");
			CredentialServices.setLastName("patel");
		
		email.showCredentials();
		}

}
