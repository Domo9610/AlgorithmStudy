import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    String [] arr = input.split(" ");

    long result = Long.parseLong(arr[0]) + Long.parseLong(arr[1]);
    System.out.println(result);
    
  } 
}
