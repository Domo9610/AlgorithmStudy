import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String [] arg = input.split(" ");

        int a = Integer.parseInt(arg[0]);
        int b = Integer.parseInt(arg[1]);

        System.out.println((a > b)? 1 : 0);

    }
}
