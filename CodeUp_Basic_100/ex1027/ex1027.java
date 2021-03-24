//1027

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input = sc.nextLine();
		
		String[] array = input.split("\\.");
		
		System.out.printf("%02d-%02d-%04d\n",
		Integer.parseInt(array[2]),
		Integer.parseInt(array[1]),
		Integer.parseInt(array[0]));
	}
}
