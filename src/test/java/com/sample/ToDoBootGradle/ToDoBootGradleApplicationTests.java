package com.sample.ToDoBootGradle;

import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.springframework.boot.web.server.LocalServerPort;

//@RunWith(SpringRestPactRunner.class)
//@PactFolder("pact")
//@Provider("userservice")
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ToDoBootGradleApplicationTests {

	@LocalServerPort
	private int localServerPort;

	@TestTarget
	public final Target target = new HttpTarget(localServerPort);

//	@State("provider accepts a new person")
//	public void createUserTest(){
//	}

}
