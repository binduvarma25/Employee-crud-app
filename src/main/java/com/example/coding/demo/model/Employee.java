package com.example.coding.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private double salary;
    private Date joiningDate;
    private String role;

}
