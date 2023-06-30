package com.knoldus.nashtechassignment.controller;

import com.knoldus.nashtechassignment.model.Assignment;
import com.knoldus.nashtechassignment.service.impl.AssignmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/example")
public class AssignmentController {

    @Autowired
    private AssignmentServiceImpl assignmentService;

    @PostMapping("/create-document")
    public void createDocument(@RequestBody Assignment assignment) throws Exception {
        assignmentService.createUser(assignment);
    }

//    @GetMapping("/get-document/{id}")
//    public void getDocument(@PathVariable Long id) throws ExecutionException, InterruptedException {
//        assignmentService.getAssignmentById(id);
//    }
}