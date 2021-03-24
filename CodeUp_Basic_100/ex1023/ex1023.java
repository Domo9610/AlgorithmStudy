import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String input;
		input = sc.nextLine();
		
		String[] array = input.split("\\.");
		
		int front = Integer.parseInt(array[0]);
		int rear = Integer.parseInt(array[1]);
		
		System.out.printf("%d\n%d", front, rear);	
	
	}
}
