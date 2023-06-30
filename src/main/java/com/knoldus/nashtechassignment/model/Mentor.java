package com.knoldus.nashtechassignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.auditing.CurrentDateTimeProvider;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mentor {

    @Id
    private Long mentorId;

    private String emp_id;

    private String competency_name;

    private CurrentDateTimeProvider modified_date;

    private CurrentDateTimeProvider created_date;


}
