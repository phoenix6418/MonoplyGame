package test;
import static org.junit.Assert.*;

import org.junit.Test;

import model.Board;

public class BoardTest {

	
	// Test if board initialized correctly
	@Test
	public void boardSizeTest() {
		Board b = new Board();
		assertEquals (40, b.getSize());
	}
}
	
