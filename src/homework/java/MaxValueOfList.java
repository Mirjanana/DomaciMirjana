package homework.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxValueOfList {
	

	public static void main(String[] args) {
		List <Integer> listOfNumbers = new ArrayList <Integer> ();
		listOfNumbers.add (6);
		listOfNumbers.add (2);
		listOfNumbers.add (9);
		listOfNumbers.add (14);
		listOfNumbers.add (8);
//		System.out.println(sumOfNumbers(listOfNumbers));
//		System.out.println(avarageNumber(listOfNumbers));		
	//	System.out.println(maxValue(listOfNumbers));
		
	Collections.sort (listOfNumbers);
	
	
	 System.out.println ("Max vrednost elementa je " + listOfNumbers.get (listOfNumbers.size()-1));
}	
	
 public static int sumOfNumbers(List <Integer> listOfNumbers) {
	int sum=0;
	 for (int i=0; i<listOfNumbers.size (); i++) {
		 sum=sum+listOfNumbers.get(i);		 
	 }
	return sum;
 }
public static double avarageNumber(List <Integer> listOfNumbers) {
double avarage = sumOfNumbers(listOfNumbers) / listOfNumbers.size();
return avarage;
 }
}
