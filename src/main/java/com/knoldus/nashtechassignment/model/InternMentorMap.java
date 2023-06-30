package com.knoldus.nashtechassignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.auditing.CurrentDateTimeProvider;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InternMentorMap {

    @Id
    @OneToOne
    @JoinColumn(name = "intern_id")
    private Intern intern;

    @Id
    @OneToOne
    @JoinColumn(name = "mentorId")
    private Mentor mentor;

    private CurrentDateTimeProvider modified_date;

    private CurrentDateTimeProvider created_date;

}
