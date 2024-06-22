package com.simplepro;

public class Palindrom {
	
	public static void main(String[] args) {
		
		String s1="madam";
		//char []a=new char[10];
		//char []a=s1.toCharArray();
		//a=s1.toCharArray();
		//System.out.println(a);
		//char []compare=new char[10];
		//char []b=null;
		//char []c=null;
		boolean flg=false;
		
 		for(int i=0;i<s1.length();i++)
		{
			//System.out.println("outer for");
			for(int j=s1.length()-i-1;;j--)
			{
				//System.out.println("inner for");
				if(s1.charAt(j)==s1.charAt(i))
				{
					System.out.println(s1.charAt(i)+ " "+s1.charAt(j));
				}
				else
				{
					System.out.println("not");
					flg=true;
					break;
				}
			}
		}
		if(!flg){
			System.out.println("palindrom");
		}else
		{
			System.out.println("not");
		}
		
		System.out.println("=========================");
		boolean flag=false;
		for(int i=0,j=s1.length()-1;i<s1.length();i++,j--){
			
			if(s1.charAt(i)==s1.charAt(j))
			{
				System.out.println(s1.charAt(i)+ " "+s1.charAt(j));
			}else{
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println("palindrom");
		}else
		{
			System.out.println("not");
		}
		
	}

}
