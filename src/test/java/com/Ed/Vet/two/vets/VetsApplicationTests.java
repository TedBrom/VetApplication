package com.Ed.Vet.two.vets;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class VetsApplicationTests
{
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	void contextLoads() throws Exception
	{
		AnimalList newList = new AnimalList();
		newList.toString();

		assertThat(restTemplate.getForObject("http://localhost:" + port + "/customRoute",
				String.class)).contains(newList.toString());
	}


}
