package chapter06_Loops;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print(" \n\n수를 입력하세요 : ");
        int row = scanner.nextInt();
        System.out.println("\n\n");


        for (int i = 0 ; i < row ; i ++ ) {
            for(int j = 0 ; j < i +1 ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = row-1 ; k > 0 ; k--){
            for(int l = k; l > 0; l -- ){
                System.out.print("*");
            }
            System.out.println();
        }

//error 고치기 성공




    }
}
