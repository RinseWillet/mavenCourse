package guru.springframework;

public class JavaHelloWorldTest {

	public void testGetHello(){

		JavaHelloWorld helloWorld = new JavaHelloWorld();

		assert("Hello World".equals(helloWorld.getHello()));

		assert!("Not Hello World".equals(helloWorld.getHello()));
	}
}
