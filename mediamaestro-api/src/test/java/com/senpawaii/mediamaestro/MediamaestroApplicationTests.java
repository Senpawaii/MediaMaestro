package com.senpawaii.mediamaestro;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.utility.TestcontainersConfiguration;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class MediamaestroApplicationTests {

	@Test
	void contextLoads() {
	}

}
