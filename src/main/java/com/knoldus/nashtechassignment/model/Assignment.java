package com.knoldus.nashtechassignment.model;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {
    @DocumentId
    private String assignment_id;
    private String technology;
    private String topic;
    private String created_by;
    private String assigned_to;
    private List<Question> questions;

}

