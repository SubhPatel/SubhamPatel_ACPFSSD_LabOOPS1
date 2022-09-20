package com.email.service;
import java.util.Random;
import java.util.Scanner;
public class CredentialServices {

		public CredentialServices(String firstName, String lastName,String deptName, String CompanyName) {
			
	}
		public static String GL;
		private static String firstName;
		private static String lastName;
		public static String CompanyName = GL;
		public static String deptName;
		public int EmailAddress;
		Scanner sc = new Scanner(System.in);
		
		public static String getFirstName() {
			return firstName;
		}


		public static void setFirstName(String firstName) {
			CredentialServices.firstName = firstName;
		}


		public static String getLastName() {
			return lastName;
		}


		public static void setLastName(String lastName) {
			CredentialServices.lastName = lastName;
		}

		
		public static void employee() {
			CredentialServices.setFirstName("subham");
			CredentialServices.setLastName("patel");
		}
		
		public void generateEmailAddress(String getfirstName, String getlastName, String deptName,String CompanyName){
			System.out.println("Dear Subham your Generated Credentials are as follows: ");
			System.out.println("Email ---> "+CredentialServices.getFirstName()+CredentialServices.getLastName()+"@"+ deptName +"."+CompanyName+".com");
			
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Password---> spgl");
			stringBuilder.append(generatePassword(8));
			System.out.println(stringBuilder.toString());
		}
			
		
		public void showCredentials() {
			CredentialServices Email = new CredentialServices(firstName, lastName, deptName, CompanyName);
			EmailAddress = sc.nextInt();
			switch(EmailAddress) {
			
			case 1 : Email.generateEmailAddress(CredentialServices.getFirstName(),CredentialServices.getLastName(),"tech","gl"); 
						
			break;
			
			case 2 : Email.generateEmailAddress(CredentialServices.getFirstName(),CredentialServices.getLastName(),"admin","gl");
	
			break;
			case 3 : Email.generateEmailAddress(CredentialServices.getFirstName(),CredentialServices.getLastName(),"hr","gl");
		
			break;
			case 4 : Email.generateEmailAddress(CredentialServices.getFirstName(),CredentialServices.getLastName(),"legal","gl");

			break;
			default : System.out.println("Invalid Choice");
			
		
			
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
		   
		      for(int i = 8; i< length ; i++) {
		         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		      }
		      return password;
		   }


		
			
		}
		
			
		
		
	

