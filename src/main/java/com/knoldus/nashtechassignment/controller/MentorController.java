package com.knoldus.nashtechassignment.controller;

import com.knoldus.nashtechassignment.model.Mentor;
import com.knoldus.nashtechassignment.service.impl.MentorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MentorController {

    @Autowired
    MentorServiceImpl mentorService;

    @GetMapping("/getMentors")
    public ResponseEntity<List<Mentor>> getAllMentors(){
        return ResponseEntity.ok(mentorService.getMentors());
    }

    @PostMapping("/addMentor")
    public ResponseEntity<Mentor> addMentor(@RequestBody Mentor mentor){
        return ResponseEntity.ok(mentorService.addMentorDetails(mentor));
    }

    @DeleteMapping("deleteMentor/{id}")
    public void deleteProjectById(@PathVariable Long id){
        mentorService.deleteMentorById(id);
    }

    @GetMapping("/getMentor/{id}")
    public ResponseEntity<Mentor> getMentorDetailById(@PathVariable Long id){
        return ResponseEntity.ok(mentorService.getMentorDetail(id));
    }

    @PutMapping("/updateMentor")
    public ResponseEntity<Mentor> updateMentor(@RequestBody Mentor mentor){
        return ResponseEntity.ok(mentorService.updateMentor(mentor));
    }
}
