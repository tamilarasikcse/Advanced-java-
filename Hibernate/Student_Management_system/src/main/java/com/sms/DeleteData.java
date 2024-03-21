package com.sms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteData {
    public static void main(String[] args) {
        // Obtain SessionFactory from HibernateUtil class
        SessionFactory factory = hibernateutil.getSessionFactory();

        // Open session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Retrieve the student by ID
            Student studentToDelete = session.get(Student.class, "S112");

            // Check if the student exists
            if (studentToDelete != null) {
                // Delete the student
                session.delete(studentToDelete);
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student with ID S112 not found.");
            }

            transaction.commit();
        } catch (Exception e) {
            // Rollback transaction in case of exception
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace(); // Better to log the exception
        } finally {
            // Close session
            session.close();
        }

        // No need to close SessionFactory here
    }
}
