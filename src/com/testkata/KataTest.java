package com.testkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import com.kata.Game;

public class KataTest {
	List<String> secret = new ArrayList<String>();
	List<String> guess = new ArrayList<String>();
	List<Integer> expected = new ArrayList<Integer>(2);
	Game game = new Game();
	
	@Test
	void testCase1() {
		// For a secret [blue, red, green, pink] and a guess [yellow, red, blue, purple]
		// the answer should be : 1 well placed and 1 misplaced.
		
		secret.addAll(List.of("blue","red", "green", "pink"));
		guess.addAll(List.of("yellow", "red", "blue", "purple"));

		expected.add(1);
		expected.add(1);
		assertEquals(expected, game.evaluate(secret, guess));
	}
	
	@Test
	void testCase2() {
		//evaluate([blue], [red]) should return [0, 0]
		
		secret.add("blue");
		guess.add("red");

		expected.add(0);
		expected.add(0);

		assertEquals(expected, game.evaluate(secret, guess));
	}
	
	@Test
	void testCase3() {
		//evaluate([red, yellow], [blue, red]) should return [0, 1] 
		
		secret.addAll(List.of("red", "yellow"));
		guess.addAll(List.of("blue","red"));

		expected.add(0);
		expected.add(1);

		assertEquals(expected, game.evaluate(secret, guess));
	}
}
