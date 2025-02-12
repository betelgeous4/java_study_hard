package chapter06_Loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        /*
            별 찍기를 통한 for 문 구조 학습
         */
//        for(int i = 0 ; i < 6 ; i ++) {
//            System.out.println();
//            for(int j = 0 ; j < i ; j ++) {
//                System.out.print("*");
//            }
//        }

//        //별이 5줄 찍히는 예시
//        for(int i = 0 ; i < 5 ; i ++) {
//            for(int j = 0 ; j < i + 1 ; j ++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
            숫자를 입력받아 그 줄 수만큼의 별찍기가 이루어질 수 있도록 작성하시오

            실행예
            숫자를 입력하세요 >>> 3
            *
            **
            ***


         */

        //스캔, 숫자 입력
        Scanner scanner = new Scanner(System.in);
//        int row = 0;
//        System.out.print("숫자를 입력하세요 : \n");  // row 입력
//        row = scanner.nextInt();
//
//        //반복문 작성
//        for(int i = 0; i < row ; i++ ) {   // i는 row 번 반복
//            for(int j = 0; j < i + 1 ; j++ ) {  // 별을 찍는 j는 i번 반복
//                System.out.print("* ");
//            }
//            System.out.println();
//
                // 별 반대로
//           *****
//            ****
//             ***
//              **
//               *

        // 반복문 작성
//        for(int i = 5 ; i > 0 ; i --) {
//            for (int j = 0; j < i ; j++ ) {
//                System.out.print("🚀"); // 윈도우 + 점 하면 이모티콘
//            }
//            System.out.println();
//        }

        // 별 찍기
//                *
//               **
//              ***
//             ****
//            *****

        //반복문1 작성
//        for(int i = 0; i < 3 ; i++) {
//            //공백 위한 반복문
//           for( int j =0 ; j < (4-i) ; j++) {
//                System.out.print(" ");
//           }
//           for ( int k = 0 ; k < i + 1 ; k ++) {
//               System.out.print("*");
//           }
//            System.out.println("");
//        }

        // 반복문2 작성
        for(int i = 5; i > 0 ; i --) {
            for (int j = 0 ; j < i ; j ++) System.out.print(" ");
            for (int k = 0 ; k < (6-i) ; k ++) System.out.print("*");
            System.out.println();
        }


    }
}