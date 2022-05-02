package com.portifolio.Site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.portifolio.Site.model.Projects;

@Controller
public interface ProjectsRepository extends JpaRepository<Projects, Long> {

}
