package com.task.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author prasanth.pillai
 * @version 1.0
 *
 */
public class Sorting {

	/*
	 * Initial version
	 */
	
	//list of integers to hold the final sorted values
	public List <Integer> numbers;

	public Sorting(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}
	
	//initialise the attribute
	public Sorting() {
		super();
		this.numbers = new ArrayList<Integer>();
	}
	
	//add a new number to the list
	public void addToDraw(int number) {
		
		add(number);
		//return numbers;
	}

	private void add(int number) {
		
		if ( numbers.size() == 0) 
			numbers.add(number);
		else
			addToCurrentList(number);
		}

	/*
	 * Actual sorting logic.
	 * this a simple logic with no java.util or helper class usage
	 */
	
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
