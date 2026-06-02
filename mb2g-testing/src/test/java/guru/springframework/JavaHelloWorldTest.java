package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JavaHelloWorldTest {

	@Test
	public void testGetHello(){

		JavaHelloWorld helloWorld = new JavaHelloWorld();

		assertEquals("Hello World", helloWorld.getHello());

		assertNotEquals("Not Hello World", helloWorld.getHello());
	}
}
