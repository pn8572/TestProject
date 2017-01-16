package com.task.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author prasanth.pillai
 *
 */
public class Sorting {

	/*
	 * Initial version
	 */
	
	public List <Integer> numbers;

	public Sorting(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}
	
	public Sorting() {
		super();
		this.numbers = new ArrayList<Integer>();
	}
	public List<Integer> addToDraw(int number) {
		
		add(number);
		return numbers;
	}

	private void add(int number) {
		
		if ( numbers.size() == 0) 
			numbers.add(number);
		else
			addToCurrentList(number);
		}

	private void addToCurrentList(int number) {
		
		int i = 0;
		for (int itemNum : numbers) {
			if (itemNum > number) 
				break;
			i++;
		}
		numbers.add(i, number);
	}
		
	
	

}
