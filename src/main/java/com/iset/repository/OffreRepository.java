package com.iset.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iset.entity.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> { 
}
