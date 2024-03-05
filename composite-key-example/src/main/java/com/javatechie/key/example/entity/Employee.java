package com.javatechie.key.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_TBL_COMPOSITE_KEY")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    @EmbeddedId
    private EmployeePKId employeePKId;
	private String name;
    private String email;
    private String phone;
}
