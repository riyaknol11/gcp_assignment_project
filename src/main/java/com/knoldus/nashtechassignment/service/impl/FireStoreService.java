package com.knoldus.nashtechassignment.service.impl;


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.knoldus.nashtechassignment.model.Assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;


@Service
public class FireStoreService {

    private final Firestore firestore;

    @Autowired
    public FireStoreService(Firestore firestore) {
        this.firestore = firestore;
    }

    public void addUser(Assignment assignment) throws ExecutionException, InterruptedException {
        ApiFuture<WriteResult> result = firestore.collection("assignment").document(String.valueOf(assignment.getAssignment_id())).set(assignment);
        System.out.println("Update time : " + result.get().getUpdateTime());
    }
}