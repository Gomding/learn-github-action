package com.learn.github.action.githubaction;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GithubActionApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void failTest() {
		assertThat("1234").isEqualTo("4321");
	}

}
