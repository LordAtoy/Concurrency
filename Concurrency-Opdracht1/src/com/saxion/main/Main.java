package com.saxion.main;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static ArrayList<Integer> random;
	public static Random rand;
	private static int number;
	private static final int listSize = 10000;
		
	public static void main(String[] args){
		random = new ArrayList<Integer>();
		rand = new Random();
		fillList(random);
		sortList(random);
		printList(random);
	}
	
	public static void fillList(ArrayList<Integer> list){
		for (int j = 0; j < listSize; j++){
            number = rand.nextInt(listSize);
            random.add(number);
        }
	}
	
	public static void printList(ArrayList<Integer> list){
		for(Integer i : random){
			System.out.println("" + i);
		}
	}
	
	public static void sortList(ArrayList<Integer> list) {
		int val;
		int holePos;

		// At the beginning of each iteration arr[0..k-1] has been sorted, and
		// the loop then
		// inserts element k into its proper place
		for (int k = 1; k < list.size(); k++) {
			// make a copy of the value to insert
			val = list.get(k);

			// The kth position is where the "hole" starts
			holePos = k;

			// Move the "hole" left until we either get the the end of the array
			// or the element left of the hole is <= to the value we're
			// inserting
			while (holePos > 0 && list.get(holePos - 1) > val) {
				// move the hole to the left
				list.set(holePos, list.get(holePos - 1));
				holePos--;
			}

			// copy the value into the hole
			list.set(holePos, val);
		}
	}
	
	

}
