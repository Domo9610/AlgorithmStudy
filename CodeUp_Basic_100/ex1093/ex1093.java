import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String[] array = input2.split(" ");
        int[] intarry = new int[array.length];

        for(int i=0; i< array.length; i++){
            intarry[i]=Integer.parseInt(array[i]);
        }

        int[] checknum = new int[23];

        for(int num=0; num<checknum.length; num++){
            for(int x=0; x<Integer.parseInt(input1); x++){
                if(intarry[x]==num+1){
                    checknum[num]++;
                }
            }
            if(num == checknum.length-1) {
                System.out.println(checknum[num]);
            }
            else
            {
                System.out.printf("%d ", checknum[num]);
            }

        }
    }
}
