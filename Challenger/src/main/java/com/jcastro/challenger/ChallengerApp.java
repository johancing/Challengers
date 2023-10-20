package com.jcastro.challenger;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.jcastro.challenger.cases.IUseCase;
import com.jcastro.challenger.cases.impl.MeliChallenger;
import com.jcastro.challenger.cases.impl.WordsCounter;

public class ChallengerApp {

	private static final Logger LOG = Logger.getLogger(ChallengerApp.class.toString());

	public static void main(String[] args) {
		IUseCase challenger = new WordsCounter();
		LOG.log(Level.INFO, "Challenger result: {0}", challenger.execute("casa casa tetero casa te te cafe cafe"));
		challenger = new MeliChallenger();
		LOG.log(Level.INFO, "Challenger result: {0}", challenger.execute("aaaabbeeedddddq"));
	}

}
