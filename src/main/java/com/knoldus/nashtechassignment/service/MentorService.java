package com.knoldus.nashtechassignment.service;

import com.knoldus.nashtechassignment.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MentorService{
    List<Mentor> getMentors();
    Mentor addMentorDetails(Mentor mentor);
    String deleteMentorById(Long id);
    Mentor getMentorDetail(Long id);
    Mentor updateMentor(Mentor mentor);
}
