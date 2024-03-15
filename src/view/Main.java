package view;

import threads.ArrayThread;
import util.ArraysOperations;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[1000];
		
		ArraysOperations.fillRandomly(array, 100, 1);
				
		ArrayThread simpleFor = new ArrayThread(array, ArrayThread.SIMPLE_FOR);
		ArrayThread forEach = new ArrayThread(array, ArrayThread.FOR_EACH);
		simpleFor.start();
		forEach.start();
		
	}

}
