package com.capgemini.basepackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.basepackage.entity.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>{

}
