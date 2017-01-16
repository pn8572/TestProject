package com.task.number;

public class NumberToWords {
	
	public String convert(int number) {
		
		/*
    	 * Write a program which given a whole number between 0 and 1 billion; writes it out in words.
    	 * 
    	 * 1 billion = 100,00,00,000
    	 */
    	if ( number < 2 || number > 1000000000)
    		return "invalid input";
        
        String prefix = "";
        
        String current = "";
        int position = 0;
        
        do {
            int n = number % 1000;
            if (n != 0) {
                String s = convertLessThan1000(n);
                current = s + largerPositions[position] + current;
            }
            position++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
	}
    private static final String[] numNames = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };
    
    private static final String[] tensPositions = {
	        "",
	        " ten",
	        " twenty",
	        " thirty",
	        " forty",
	        " fifty",
	        " sixty",
	        " seventy",
	        " eighty",
	        " ninety"
	};
    
    private static final String[] largerPositions = {
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	};
    
    /*
     * the number which is modularised to less than 1000 and then converting to words.. 
     */
private String convertLessThan1000(int currentNumber) {
    	
        String recentStringValue;
        
        if (currentNumber % 100 < 20) {
            recentStringValue = numNames[currentNumber % 100];
            currentNumber /= 100;
        }
        else {
            recentStringValue = numNames[currentNumber % 10];
            currentNumber /= 10;
            
            recentStringValue = tensPositions[currentNumber % 10] + recentStringValue;
            currentNumber /= 10;
        }
        
        if (currentNumber == 0) return recentStringValue;
        
        return numNames[currentNumber] + " hundred" + recentStringValue;
    }


}
