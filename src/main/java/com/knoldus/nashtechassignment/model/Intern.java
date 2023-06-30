package com.knoldus.nashtechassignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Intern {

    @Id
    private Long intern_id;
    private String emp_id;
    private String first_name;
    private String last_name;
    private String competency_name;
    private String skill;
    private LocalDate created_date = LocalDate.now();
    private LocalDate modified_date = LocalDate.now();

}