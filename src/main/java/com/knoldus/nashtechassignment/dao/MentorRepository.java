package com.knoldus.nashtechassignment.dao;

import com.knoldus.nashtechassignment.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<Mentor, Long> {
}
