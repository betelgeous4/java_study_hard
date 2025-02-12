package chapter06_Loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            n에 숫자를 입력하여 몇 번 반복할지를 정하고
            1부터 n까지 표시하는 박복문을 작성하시오
         */
    // #1. Scanner import
    Scanner scanner = new Scanner(System.in);
    // #2. 사용할 변수 선언
        int n;
        int sum = 0;
        System.out.print("1부터 얼마까지 숫자를 표기하시겠습니까? >>> ");
        n = scanner.nextInt();

        //#3-1. 방법 1 : 강사가 의도한 방법
//        for(int i = 0; i < n; i++ ) {
//            System.out.print(i+1 + ",");
//            sum = sum + i;
//        }
//
//        System.out.println("\n1부터" + n + "까지의 합은 " + (sum+n) + "이다.");

        //#3-2. 방법 2 : 신박한 방법

        for(int i = 0; i < n; i++ ) {
            System.out.print(i+1 + ",");
            sum = sum + (i+1);
        }

        System.out.println("\n1부터" + n + "까지의 합은 " + sum + "이다.");














    }
}
