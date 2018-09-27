package assignment3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest<T> {

	Stack<T> myStack = new Stack<T>();
	
	
	StackNode<T> firstNode = new StackNode<T>((T) "firstNode");
	StackNode<T> second = new StackNode<T>((T) "secondNode");
	
	Integer x = 3;
	StackNode<T> diffType = new StackNode<T>((T) x);
	
	Object o;
	StackNode<T> diffType2 = new StackNode<T> ((T) o);
	 
	Stack<T> empt = new Stack<T>();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	@Test
	void testPeek() {
		myStack.push(firstNode);
		assertEquals("firstNode", myStack.peek().getData());
	}
	
	@Test
	void testPush() {
		
		
		myStack.push(second);
		assertEquals("secondNode", myStack.peek().getData());
	}
	
	@Test
	void testPop() {
		myStack.push(firstNode);
		myStack.push(second);
		StackNode<T> ret; 
		ret = myStack.pop();
		assertEquals("secondNode", ret.getData());
	}
	
	@Test
	void testIsEmpty() {
		assertTrue(empt.isEmpty());		
	}
	
	@Test
	void testMultDataTypes() {
		myStack.push(diffType);
		assertEquals(3, myStack.peek().getData());
		myStack.push(diffType2);
		StackNode<T> test2 = myStack.peek();
		T arrt = test2.getData();
		assertEquals(o , arrt);
	}
	
	@Test 
	void testPeekException() {
		try {
			myStack.peek();
			fail("Empty Stack Exception");
		}
		catch (EmptyStackException e){
			
		}
	}
	
	@Test
	void testPopException() {
		try {
			myStack.pop();
			fail("Empty Stack Exception");
		}
		catch (EmptyStackException e) {
			
		}
	}
	
	
	

}
