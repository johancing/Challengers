package com.jcastro.challenger.cases.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.jcastro.challenger.cases.IUseCase;

public class WordsCounter implements IUseCase {

	@Override
	public String execute(String string) {
		if (string == null || string.isEmpty())
			throw new IllegalArgumentException();
		List<String> words = Arrays.asList(string.trim().split(" "));
		Map<String, Long> map = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		StringBuilder sb = new StringBuilder();
		map.forEach((k, v) -> {
			sb.append(k);
			sb.append(":");
			sb.append(v);
			sb.append(",");
		});
		int index = sb.toString().length();
		return sb.toString().substring(0, index - 1);
	}

}
