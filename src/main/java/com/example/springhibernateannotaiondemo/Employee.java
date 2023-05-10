package com.example.springhibernateannotaiondemo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="EmployeePallavi")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
           @Column(name="employeeId")
    int eid;
    @GeneratedValue(strategy = GenerationType.AUTO)
    String ename;
    double salary;
}
