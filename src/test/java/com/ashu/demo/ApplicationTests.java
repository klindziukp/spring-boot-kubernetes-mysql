package com.ashu.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ashu.demo.web.PetController;

@SpringBootTest
public class ApplicationTests {

	@Autowired
	private PetController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
