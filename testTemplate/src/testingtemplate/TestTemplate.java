package testingtemplate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTemplate {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void oneVariable() throws Exception {
		Template template = new Template("Hello, ${name}");
		template.set("name", "Reader");
		assertEquals("Hello, Reader", template.evaluate());
	}
	
	@Test
	void differentValue() throws Exception{
		Template template = new Template("Hi, ${name}");
		template.set("name", "someone else");
		assertEquals("Hi, someone else", template.evaluate());
	}
	
	@Test
	void multipleVariables() throws Exception{
		Template template = new Template("${one} ${two} ${three}");
		template.set("one", "1");
		template.set("two", "2");
		template.set("three", "3");
		assertEquals("1 2 3", template.evaluate());
	}

}
