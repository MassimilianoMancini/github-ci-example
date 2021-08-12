package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest 
{

	private App app;
	
	@BeforeEach
	void setup() {
		app = new App();
	}
	
	@Test
    void testSayHello()
    {
        assertThat(app.sayHello()).isEqualTo("Hello");
    }
	
	@Test
	void testSayHelloWithName() {
		assertThat(app.sayHello("World")).isEqualTo("Hello World");
	}
}
