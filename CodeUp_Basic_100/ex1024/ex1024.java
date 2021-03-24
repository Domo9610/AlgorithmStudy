//1024

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input;
		input = sc.nextLine();
		
		String[] array = input.split("");
		
		for(int i = 0;  i < array.length;  i++){
			
			System.out.printf("'%s'\n",array[i]);
			
		}
	}
}
