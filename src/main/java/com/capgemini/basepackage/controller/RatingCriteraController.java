package com.capgemini.basepackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.basepackage.entity.RatingCriteria;
import com.capgemini.basepackage.repository.RatingCriteriaRepo;
import com.capgemini.basepackage.service.RatingCriteriaService;

@RestController
@RequestMapping("/Ratingcriteria")
public class RatingCriteraController {

	@Autowired
	private RatingCriteriaService ratingCriteriaService;

	@PostMapping("/")
	public String rating(@RequestBody RatingCriteria ratingCriteria) {
		
		ratingCriteriaService.createCriteria(ratingCriteria);
		return "Rating Criteria successfully established";
	}

}
