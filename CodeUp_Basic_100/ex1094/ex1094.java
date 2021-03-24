//1094

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		sc.nextLine();
		String input2 = sc.nextLine();
		String[] array = input2.split(" ");
		int[] checkarray =  new int[array.length];
		
		for(int i = 0; i < n;  i++)
		{
			checkarray[i] = Integer.parseInt(array[n-1-i]);	
			int num = checkarray[i];
			System.out.printf("%d ",num);
		}
	}
}
