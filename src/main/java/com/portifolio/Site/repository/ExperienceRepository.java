package com.portifolio.Site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portifolio.Site.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>{

}
