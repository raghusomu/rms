package com.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.repo.entity.RateEntity;

@Repository
public interface RateRepository extends JpaRepository<RateEntity, Long>{

}

