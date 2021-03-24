import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    int change = Integer.parseInt(input, 8);

    System.out.printf("%d", change);
    
  } 
}
