package exceptionHandling.demo4;

import java.util.Scanner;

public class AnExampleOfUncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        do {
            y = sc.nextInt();
            if(y == 0){
                System.out.println("Wrong value. y can't be 0");
            }
            else{
                // no code
            }
        }
        while(y == 0);

        int res = x/y;
        System.out.println(res);

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        arr[3] = 4;


    }
}
