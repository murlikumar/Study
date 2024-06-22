package com.simplepro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentRecord {
	
	public  ArrayList listOfRecords=new ArrayList();
  
	public static void main(String[] args) {
		
		StudentRecord srec=new StudentRecord();
	//ArrayList arr=srec.listOfStudentRec();
		HashMap hmap=srec.listOfStudentRec();
	//System.out.println(arr);
		DbConn con=new DbConn();
		try{
			Connection conn=con.getConnection();
			con.insertData(conn, hmap);
		}catch(Exception ex)
		{
			System.out.println("Exception in inserting"+ex);
			ex.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		String decider=null; 
		do
		{
			System.out.println("enter the id");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println(id);
			
			
			 
			ArrayList al=(ArrayList)hmap.get(String.valueOf(id));
			System.out.println("Result----------------------"+al);
			/*ArrayList ar=new ArrayList();
			String result="No";
			String name=null;
			int marks;
			boolean flag=false;
			for(int i=0;i<arr.size();i++)
			{
				//System.out.println(arr.get(i));
				ar=(ArrayList) arr.get(i);
				//System.out.println(ar.get(0));
				
				if(id == Integer.parseInt(((String)ar.get(0))))
				{
					System.out.println("done");
					name=(String)ar.get(1);
				    marks=Integer.parseInt(((String)ar.get(2)));
				    result=name +"," + marks;
					//break;
				    flag=true;
				}
				else
				{
					System.out.println("no");
					
				}
				
			}
			if(!flag)
			{
				System.out.println("data are not available");
			}
			else
			{
				System.out.println(result);
			}*/
			
			
			System.out.println("do u want cont?");
			decider=sc.nextLine();
			
			
			
		}while("Y".equalsIgnoreCase(decider));
		
		
	}
	public HashMap listOfStudentRec()
	{
		HashMap map=new HashMap();
		try{
			String line = "";
		
		File file=new File("record.txt");
		FileReader fr=new FileReader(file);
		System.out.println(file);
		BufferedReader br=new BufferedReader(fr);
		
		while((line=br.readLine())!=null)
		{
			ArrayList listOfRecord=new ArrayList();
			//System.out.println(line);
			String []str=line.split(",");
			
			for(int i=0;i<str.length;i++)
			{
				listOfRecord.add(str[i]);
			}
			map.put(listOfRecord.get(0), listOfRecord);
			
			//listOfRecords.add(listOfRecord);

		}
		//System.out.println(listOfRecords);
		
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		//return listOfRecords;
		return map;
	}

}
