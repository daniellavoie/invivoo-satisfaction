package com.invivoo.satisfaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invivoo.satisfaction.model.impl.ConsultantImpl;

public interface ConsultantRepository extends JpaRepository<ConsultantImpl, String> {

}
