package ex1095;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int Minvalue = 24;

            int count = sc.nextInt();
            sc.nextLine();
            String ramnum = sc.nextLine();

            String[] arr = ramnum.split(" ");

            for (int a = 0; a < count; a++) {
                int compare = Integer.parseInt(arr[a]);
                if (Minvalue > compare)
                {
                    Minvalue = compare;
                }
            }
            System.out.println(Minvalue);
        }
    }
