package com.example.coding.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private double salary;
    @PastOrPresent
    private Date joiningDate;
    @NotBlank
    private String role;

}
