package ex17;

//1018
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split("\\.");

        int[] arr = new int[3];

        for (int i = 0; i<array.length; i++){
            arr[i] = Integer.parseInt(array[i]);
        }

        System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
    }
}
