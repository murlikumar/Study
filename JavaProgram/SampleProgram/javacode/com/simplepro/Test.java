package com.simplepro;

public class Test {
	
	
	public static void main(String[] args) {
		
		String s1="JA";
		String s2="VA";
		String s3=s1+s2;
		String s4="JAVA";
		String s5="JA" + s2;
		String s6="JA"+"VA";
		String s7="JAVA";
		
		System.out.println(s3==s4);//false
		System.out.println(s3==s5);//false
		System.out.println(s3==s6);//false
		System.out.println(s4==s5);//false
		System.out.println(s4==s6);//true
		System.out.println(s5==s6);//false
		System.out.println(s4==s7);//true
	}
	

}
