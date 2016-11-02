package com.invivoo.satisfaction.tests.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.invivoo.satisfaction.model.impl.ConsultantImpl;
import com.invivoo.satisfaction.tests.SatisfactionTestApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SatisfactionTestApplication.class)
public class ConsultantControllerTest {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${satisfaction.server.url}")
	private String satisfactionServerUrl;

	@Test
	public void testFindAll() {
		Assert.assertEquals("Should have returned 3 consultants.", 3,
				restTemplate.exchange(satisfactionServerUrl + "/consultant", HttpMethod.GET, null,
						new ParameterizedTypeReference<List<ConsultantImpl>>() {
						}).getBody().size());
	}
}
