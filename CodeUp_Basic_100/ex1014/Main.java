package ex13;

//1014
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        String[] array = x.split(" ");

        System.out.println(array[1] + " " + array[0]);
    }
}
