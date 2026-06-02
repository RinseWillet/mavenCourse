package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class JavaHelloWorldTest {

	@Test
	void getHello() {
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

		assertNotEquals("Hello World", javaHelloWorld.getHello());

		assertEquals(javaHelloWorld.getHello(), javaHelloWorld.MESSAGE);
	}
}
