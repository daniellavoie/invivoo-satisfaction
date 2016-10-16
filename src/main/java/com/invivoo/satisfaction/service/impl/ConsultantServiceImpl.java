package com.invivoo.satisfaction.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.invivoo.satisfaction.model.Consultant;
import com.invivoo.satisfaction.service.ConsultantService;

@Service
public class ConsultantServiceImpl implements ConsultantService {
	private List<Consultant> CONSULTANTS = Arrays.asList(new Consultant("Daniel", "Lavoie"),
			new Consultant("Jérémy", "Valentin"), new Consultant("Christophe", "Godard"));

	@Override
	public List<Consultant> findAll() {
		return CONSULTANTS;
	}

}
