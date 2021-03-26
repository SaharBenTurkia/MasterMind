package com.kata;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private int wellplaced = 0;
	private int misplaced = 0;
	private List<Integer> result = new ArrayList<Integer>(2);
	
	public int getWellplaced() {
		return wellplaced;
	}

	public void setWellplaced(int wellplaced) {
		this.wellplaced = wellplaced;
	}

	public int getMisplaced() {
		return misplaced;
	}

	public void setMisplaced(int misplaced) {
		this.misplaced = misplaced;
	}

	public List<Integer> getResult() {
		return result;
	}

	public void setResult(List<Integer> result) {
		this.result = result;
	}

	public List<Integer> evaluate(List<String> secret, List<String> guess) {
		for (String element: guess) {
			if (secret.contains(element)) {
				if (secret.indexOf(element) == guess.indexOf(element)) {
					wellplaced++;
				} else {
					misplaced++;
				}
			}
		}
		result.add(wellplaced);
		result.add(misplaced);
		return result;
	}
}
