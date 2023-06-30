package com.knoldus.nashtechassignment.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
public class FireStoreConfig {

    @Value("${google.application.credentials}")
    private String credentialsLocation;
    @Bean
    public Firestore firestore() throws IOException {
        FileInputStream serviceAccount = new FileInputStream(credentialsLocation);

        FirestoreOptions firestoreOptions = FirestoreOptions.getDefaultInstance().toBuilder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        return firestoreOptions.getService();
    }
}
