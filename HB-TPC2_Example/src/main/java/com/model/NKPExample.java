package com.model;

import org.hibernate.*;
public class NKPExample
{
	public static void main(String[]args)
	{
		Transaction tr=null;
		try (Session ses=HBUtil2.getSessionFactory().openSession())
		{
			tr=ses.beginTransaction();
			Employee1 e1=new Employee1("Bevin");
			RegularEmployee e2=new RegularEmployee("sales",5500,10000);
			Trainee e3=new Trainee("Dhanush",200,"6 months");
			
			ses.persist(e1); 
			ses.persist(e2); 
			ses.persist(e3);
			tr.commit();
			ses.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}