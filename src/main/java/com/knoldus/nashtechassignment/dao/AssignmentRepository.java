package com.knoldus.nashtechassignment.dao;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreRpcFactory;
import com.google.cloud.firestore.WriteResult;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.knoldus.nashtechassignment.model.Assignment;

import org.springframework.stereotype.Repository;

import java.util.concurrent.ExecutionException;

@Repository
public class AssignmentRepository {

}