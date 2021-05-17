package com.capgemini.basepackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.basepackage.entity.RatingCriteria;
import com.capgemini.basepackage.repository.RatingCriteriaRepo;
@Service
public class RatingCriteriaServiceImpl implements RatingCriteriaService {
	
	
	@Autowired
	private RatingCriteriaRepo ratingCriteriaRepo;

	@Override
	public RatingCriteria createCriteria(RatingCriteria rc) {
		// TODO Auto-generated method stub
		return ratingCriteriaRepo.save(rc);
	}
	

}
