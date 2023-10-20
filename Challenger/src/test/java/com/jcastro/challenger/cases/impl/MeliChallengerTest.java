package com.jcastro.challenger.cases.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jcastro.challenger.cases.IUseCase;

class MeliChallengerTest {
	
	private IUseCase meliChallenger = new MeliChallenger();

	@Test
	void meliChallengerTest_1() {
		assertEquals("a4b2e3d5q1", meliChallenger.execute("aaaabbeeedddddq"));
	}

	@Test
	void meliChallengerTest_2() {
		assertEquals("1532d9d325e1", meliChallenger.execute("1111133dddddddddddd22222e"));
	}

}
