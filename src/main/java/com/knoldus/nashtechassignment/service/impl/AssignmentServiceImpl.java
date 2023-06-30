package com.knoldus.nashtechassignment.service.impl;

import com.knoldus.nashtechassignment.dao.AssignmentRepository;
import com.knoldus.nashtechassignment.model.Assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class AssignmentServiceImpl {
    private final AssignmentRepository assignmentRepository;

    private final FireStoreService fireStoreService;


    @Autowired
    public AssignmentServiceImpl(AssignmentRepository assignmentRepository, FireStoreService fireStoreService) {
        this.assignmentRepository = assignmentRepository;
        this.fireStoreService = fireStoreService;
    }
    public void createUser(Assignment assignment) throws ExecutionException, InterruptedException {
        fireStoreService.addUser(assignment);
    }

//    public Assignment getAssignmentById(Long id) throws ExecutionException, InterruptedException {
//        return assignmentRepository.findById(String.valueOf(id)).block();
//    }
}
