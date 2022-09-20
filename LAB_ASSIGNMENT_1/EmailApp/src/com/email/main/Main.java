package com.email.main;

import com.email.model.Department;
import com.email.service.CredentialServices;

public class Main {
	public static String GL;
	public static String firstName;
	public static String lastName;
	public static String CompanyName = GL;
	public static String deptName;
	public int EmailAddress;
	public static void main(String[] args) {
		Department dept = new Department();
		dept.insertDept();
		CredentialServices email = new CredentialServices(firstName, lastName, deptName, CompanyName);
		
		
		email.emailAddress();
		}

}
