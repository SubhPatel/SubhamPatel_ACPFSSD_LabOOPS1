package com.email.service;
import java.util.Random;
import java.util.Scanner;
public class CredentialServices {

		public CredentialServices(String firstName, String lastName,String deptName, String CompanyName) {
			
	}
		public static String GL;
		public static String firstName;
		public static String lastName;
		public static String CompanyName = GL;
		public static String deptName;
		public int EmailAddress;
		Scanner sc = new Scanner(System.in);
		public void generateEmailAddress(String firstName, String lastName, String deptName,String CompanyName){
			System.out.println("Dear Subham your Generated Credentials are as follows: ");
			System.out.println("Email ---> "+firstName+lastName+"@"+ deptName +"."+CompanyName+".com");
		}
			
		
		public void emailAddress() {
			CredentialServices Email = new CredentialServices(firstName, lastName, deptName, CompanyName);
			EmailAddress = sc.nextInt();
			switch(EmailAddress) {
			
			case 1 : Email.generateEmailAddress("subham","patel","tech","gl"); 
			System.out.println(generatePassword(8));			
			break;
			
			case 2 : Email.generateEmailAddress("subham","patel","admin","gl");
			System.out.println(generatePassword(8));	
			break;
			case 3 : Email.generateEmailAddress("subham","patel","hr","gl");
			System.out.println(generatePassword(8));
			break;
			case 4 : Email.generateEmailAddress("subham","patel","legal","gl");
			System.out.println(generatePassword(8));
			break;
			default : System.out.println("Invalid Choice");
			
			break;
			
			}
		
	
			
		
		
		
		
		
		
		}
			
		 public char[] generatePassword(int length) {
		      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		      String specialCharacters = "!@#$";
		      String numbers = "1234567890";
		      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		      Random random = new Random();
		      char[] password = new char[length];

		      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		      password[3] = numbers.charAt(random.nextInt(numbers.length()));
		   
		      for(int i = 4; i< length ; i++) {
		         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		      }
		      return password;
		   }
		
			
		}
		
	

