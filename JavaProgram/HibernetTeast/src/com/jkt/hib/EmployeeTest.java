package com.jkt.hib;



import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.jkt.bean.Employee;

public class EmployeeTest {
	
	static SessionFactory factory;
	static Session session;
	static Transaction tx;
	
	public static void main(String[] args) {
		
		try{
		
		factory=new Configuration().configure().buildSessionFactory();
		
		session=factory.openSession();
		
		Employee e=new Employee();
		
		tx=session.beginTransaction();
		
		e.setEmp_id(788);
		e.setName("manohar");
		e.setAddress("belendur");
		
		session.save(e);
		
		tx.commit();
		
		e.display();
				
		deleteEmp();
		
		
		}catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally{
			
			session.close();
			factory.close();			
		}		
		
		
		
	}

	private static void deleteEmp() {
		// TODO Auto-generated method stub
		
		try{
			
		
		tx=session.beginTransaction();
		
		Employee e=(Employee) session.get(Employee.class,500);
		
		if(e!=null){
			
			session.delete(e);
			System.out.println("DELETED SUCCESSIFULLY");
		}else{
			System.out.println("ID DOES NOT EXIST!!");
		}
		
		tx.commit();
		
	}catch (HibernateException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}

}
