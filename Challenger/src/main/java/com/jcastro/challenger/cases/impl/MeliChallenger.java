package com.jcastro.challenger.cases.impl;

import com.jcastro.challenger.cases.IUseCase;

public class MeliChallenger implements IUseCase {

	@Override
	public String execute(String string) {
		if (string == null || string.trim().isEmpty())
			throw new IllegalArgumentException("Method need a valid string.");
		StringBuilder sb = new StringBuilder();
		int contador = 0;
		char[] chars = string.toCharArray();
		char actual = chars[0];
		for (int i = 1; i < chars.length; i++) {
			if (actual == chars[i]) {
				++contador;
				if (contador == 8 ) {
					contador = save(sb, contador, actual);
					--contador;
				}
			} else {
				contador = save(sb, contador, actual);
				actual = chars[i];
			}
		}
		save(sb, contador, actual);
		return sb.toString();
	}

	private int save(StringBuilder sb, int contador, char actual) {
		sb.append(actual);
		sb.append(++contador);
		return 0;		
	}

}
