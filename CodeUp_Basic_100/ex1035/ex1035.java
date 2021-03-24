import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    int change = Integer.parseInt(input, 16);

    System.out.printf("%o", change);
    
  } 
}
