//1025

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int cal = 10000;
		Scanner sc = new Scanner(System.in);
	
		String input;
		input = sc.nextLine();
		
		String[] array = input.split("");
		
		for(int i=0; i < array.length;  i++){
		
		int output = Integer.parseInt(array[i]);
		System.out.printf("[%d]\n",output*cal);
		cal /= 10;
		}
		
	}
}
