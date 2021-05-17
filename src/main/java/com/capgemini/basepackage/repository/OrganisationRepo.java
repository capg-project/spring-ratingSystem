package com.capgemini.basepackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.basepackage.entity.Organisation;

@Repository
public interface OrganisationRepo extends JpaRepository<Organisation, Integer> {

}
