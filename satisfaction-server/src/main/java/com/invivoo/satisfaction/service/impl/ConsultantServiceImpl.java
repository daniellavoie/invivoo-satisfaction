package com.invivoo.satisfaction.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.invivoo.satisfaction.model.impl.ConsultantImpl;
import com.invivoo.satisfaction.repository.ConsultantRepository;
import com.invivoo.satisfaction.service.ConsultantService;

@Service
public class ConsultantServiceImpl implements ConsultantService {
	private ConsultantRepository consultantRepository;

	@Override
	public List<ConsultantImpl> findAll() {
		return consultantRepository.findAll();
	}
}
