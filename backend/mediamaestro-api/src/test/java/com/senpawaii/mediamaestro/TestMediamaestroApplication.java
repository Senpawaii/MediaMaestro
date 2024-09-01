package com.senpawaii.mediamaestro;

import org.springframework.boot.SpringApplication;

public class TestMediamaestroApplication {

	public static void main(String[] args) {
		SpringApplication.from(MediamaestroApplication::main).with(com.senpawaii.mediamaestro.TestcontainersConfiguration.class).run(args);
	}

}
