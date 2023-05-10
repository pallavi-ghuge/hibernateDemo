package com.example.springhibernateannotaiondemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateAnnotaionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateAnnotaionDemoApplication.class, args);
        SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Employee employee=new Employee();
        employee.setSalary(7800);
       // employee.setEname("naina");
        System.out.println(employee);


        Session session =sessionFactory.openSession();


        Transaction transaction=session.beginTransaction();
        session.save(employee);

        transaction.commit();


        session.close();


        sessionFactory.close();

    }

}
