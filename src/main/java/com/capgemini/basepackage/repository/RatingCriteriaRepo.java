package com.capgemini.basepackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.basepackage.entity.RatingCriteria;

@Repository
public interface RatingCriteriaRepo extends JpaRepository<RatingCriteria, Integer> {

}
