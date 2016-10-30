package com.invivoo.satisfaction.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invivoo.satisfaction.model.impl.ConsultantImpl;
import com.invivoo.satisfaction.service.ConsultantService;

@RestController
@RequestMapping("/consultant")
public class ConsultantController {
	private ConsultantService consultantService;

	public ConsultantController(ConsultantService consultantService) {
		this.consultantService = consultantService;
	}

	@RequestMapping
	public List<ConsultantImpl> findAll() {
		return consultantService.findAll();
	}
}
