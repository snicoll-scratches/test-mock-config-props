package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@DataJdbcTest
class MockConfigurationPropertiesConstructorBindingOnConstructorTests {

	@MockBean
	private OnConstructorTestProperties properties;

	@Test
	void contextLoads() {
		System.out.println(properties.getName());
	}

}
