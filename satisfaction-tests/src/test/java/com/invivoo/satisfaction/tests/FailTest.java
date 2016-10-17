package com.invivoo.satisfaction.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.invivoo.satisfaction.model.Consultant;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SatisfactionApplicationTests.class)
public class FailTest {
	@Value("${server.url}")
	private String serverUrl;

	@Test
	public void test() {
		Assert.assertTrue("Should have found 3 references", new RestTemplate().exchange(serverUrl + "/consultant",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Consultant>>() {
				}).getBody().size() == 3);
	}
}
