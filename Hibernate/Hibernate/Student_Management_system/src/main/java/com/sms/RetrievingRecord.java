package com.sms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RetrievingRecord {
    public static void main(String[] args) {
        // Obtain a Hibernate SessionFactory
        SessionFactory factory = hibernateutil.getSessionFactory();

        // Open a new session
        Session session = factory.openSession();

        // Begin a transaction
        Transaction transaction = session.beginTransaction();

        try {
            // Retrieve the object using the primary key
            Student student = session.get(Student.class, "S113");

            // Display data using toString() method
            System.out.println(student);

            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            // Rollback the transaction in case of any exception
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }

        // Close the Session Factory
        factory.close();
    }
}
