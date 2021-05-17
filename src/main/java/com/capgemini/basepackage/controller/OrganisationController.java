package com.capgemini.basepackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.basepackage.entity.Organisation;
import com.capgemini.basepackage.repository.OrganisationRepo;

@RestController
@RequestMapping("/organisation")
public class OrganisationController {

	@Autowired
	private OrganisationRepo organisationRepo;

	@PostMapping("/details")
	public String organisationDetails(@RequestBody Organisation organisation) {
		organisationRepo.save(organisation);
		return "Organisation Details added";

	}

	@GetMapping("/")
	public List<Organisation> allOrganisation() {
		return organisationRepo.findAll();
	}

	@PutMapping("/{orgID}")
	public String updateDetails(@PathVariable int orgID, @RequestBody Organisation org) {

		Organisation o = organisationRepo.findById(orgID).get();
		if (o != null) {
			o.setOrgRevenue(org.getOrgRevenue());
			organisationRepo.save(o);
		}
		
		return "Record Updated";

	}

}
