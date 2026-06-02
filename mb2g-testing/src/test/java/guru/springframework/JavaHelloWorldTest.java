package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class JavaHelloWorldTest {

	@Test
	public void testGetHello(){

		JavaHelloWorld helloWorld = new JavaHelloWorld();

		assertEquals("Hello World", helloWorld.getHello());

		assertNotEquals("Not Hello World", helloWorld.getHello());
	}
}
