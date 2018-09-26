package com.HibApp;


	import org.hibernate.Session;    
	import org.hibernate.SessionFactory;    
	import org.hibernate.Transaction;  
	import org.hibernate.boot.Metadata;  
	import org.hibernate.boot.MetadataSources;  
	import org.hibernate.boot.registry.StandardServiceRegistry;  
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

	public class StudentManagement {

		public static void main(String[] args) 
		{
			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        
			   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
			  
			SessionFactory factory = meta.getSessionFactoryBuilder().build();  
			Session session = factory.openSession();  
			Transaction t = session.beginTransaction();   
			            
			    StudentDB s1=new StudentDB();
			    s1.setS_Id(101);
			    s1.setS_Name("Sugeetha");
			    s1.setS_City("Virginia");
			    
			        
			    session.save(s1);  
			    t.commit();  
			    System.out.println("successfully saved");    
			    factory.close();  
			    session.close();    

		}

}
