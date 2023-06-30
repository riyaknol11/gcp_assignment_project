package com.knoldus.nashtechassignment.service.impl;

import com.knoldus.nashtechassignment.dao.MentorRepository;
import com.knoldus.nashtechassignment.model.Mentor;
import com.knoldus.nashtechassignment.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorServiceImpl implements MentorService {
    @Autowired
    MentorRepository mentorRepository;

    @Override
    public List<Mentor> getMentors() {
        return mentorRepository.findAll();
    }

    @Override
    public Mentor addMentorDetails(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public String deleteMentorById(Long id) {
        if(mentorRepository.findById(id).isPresent()) {
            mentorRepository.deleteById(id);
            return "mentor id " + id + " successfully";
        }
        else
            return "mentor not found!";
    }

    @Override
    public Mentor getMentorDetail(Long id) {
        return mentorRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Mentor updateMentor(Mentor mentor) {
        if(mentorRepository.findById((long) mentor.getMentorId()).isPresent())
            return mentorRepository.save(mentor);
       else
           return null;
    }
}
