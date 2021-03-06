package ex16;

//1017
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] array = input.split(":");
        String h = array[0];
        String m = array[1];

        System.out.println(h+":"+m);

    }
}
