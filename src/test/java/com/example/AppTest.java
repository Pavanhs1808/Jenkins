package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AppTest {

	@Test
	public void testAdd(){
		App calc=new App();
		assertEquals(8,calc.add(5,3));
	}
}
		
  
