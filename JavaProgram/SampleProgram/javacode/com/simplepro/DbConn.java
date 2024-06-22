package com.simplepro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DbConn {
	
	
	public static void main(String args[]){
		
		DbConn dbConn=new DbConn();
		Connection conn=dbConn.getConnection();
		dbConn.printData(conn);
	}

	
	public Connection getConnection(){
		Connection conn=null;
		
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn=DriverManager.getConnection("jdbc:mysql://localhost/murli", "root", "");
			
			
		}catch(Exception ex){
			
		}
		
		return conn;
	}
	
	private void printData(Connection conn){
		
		if(conn!=null){
			try{
			PreparedStatement pst=conn.prepareStatement("select * from employee");
			ResultSet rs=pst.executeQuery();
			ResultSetMetaData rsm=rs.getMetaData();
			while(rs.next()){
				int i=1;
				int columnCount=rsm.getColumnCount();
				while(i < columnCount){
				System.out.print(rs.getString(i)+"/t");
				i++;
				}
				System.out.print("/n");
			}
			}catch(Exception ex){}
		}
		
	}
	
public void insertData(Connection conn,HashMap sm){
		
		if(conn!=null){
			try{
				
				Set s=sm.keySet();
				Iterator it=s.iterator();
				while(it.hasNext()){
				ArrayList al=(ArrayList)sm.get(it.next());
				//[12345, manu, 87]
			PreparedStatement pst=conn.prepareStatement("insert into student_data(sid,sname,smarks)values (?,?,?)");
			pst.setInt(1, Integer.parseInt((String)al.get(0)));
			pst.setString(2, (String)al.get(1));
			pst.setInt(3, Integer.parseInt((String)al.get(2)));
			int i=pst.executeUpdate();
				}
			
			//ResultSet rs=pst.executeQuery();
			//ResultSetMetaData rsm=rs.getMetaData();
			//while(rs.next()){
				//int i=1;
				//int columnCount=rsm.getColumnCount();
				//while(i < columnCount){
				//System.out.print(rs.getString(i)+"/t");
				//i++;
				//}
				//System.out.print("/n");
			//}
			}catch(Exception ex){}
		}
		
	}
}
