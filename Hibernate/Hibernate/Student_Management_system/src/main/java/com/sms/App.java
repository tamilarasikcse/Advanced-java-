package com.sms;

import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
       
        SessionFactory factory = hibernateutil.getSessionFactory();
        LocalDate date1 = LocalDate.of(2000, 2, 5);
        Student student1 = new Student("S112", "Harry", "potter", date1, "P", "harry@gmail.com", "6742906745");
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        try {          
            session.save(student1);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        factory.close();
    }
}