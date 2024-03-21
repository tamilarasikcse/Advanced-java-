package com.sms;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @Column(name = "StudentId", length = 10)
    private String studentId;
    
    @Column(name = "FirstName", length = 50)
    private String firstName;
    
    @Column(name = "LastName", length = 25)
    private String lastName;
    
    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;
    
    @Column(name = "Gender", length = 25)
    private String gender;
    
    @Column(name = "Email", length = 30)
    private String email;
    
    @Column(name = "Phone", length = 25)
    private String phone;

    // Constructors
    public Student() {
        // Default constructor
    }

    public Student(String studentId, String firstName, String lastName, LocalDate dateOfBirth, String gender,
                   String email, String phone) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters
    // Note: You can use your IDE to generate getters and setters for these fields

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}