package test;

import static org.junit.Assert.*;

import org.junit.Test;

import maven.Hello;

public class HelloTest {

	@Test
	public void test() {
		Hello hello = new Hello();
		assert(hello.isAlive());
	}

}
