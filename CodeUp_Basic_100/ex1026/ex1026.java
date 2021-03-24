//1026

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input = sc.nextLine();
		
		String[] array = input.split(":");
		
		System.out.printf("%d\n",Integer.parseInt(array[1]));
	}
}

