package chapter06_Loops;
/*
    중첩 for 문(Nested for-loop) :
    형식
    for ( int i = 0 ; i < 10 ; i++ ) {
        반복 실행문 1
        for ( int j = 0 ; j < 10 ; j++ ) {
            반복 실행문2
        }
        반복 실행문 3
 */
public class Loop03 {
    public static void main(String[] args) {
//        // 사용 변수 선언
//        int a = 0;
//        int b = 0;
//
//        for (int i = 0 ; i < 5 ; i++ ) {
//            a = i;               //a값 초기화
//            System.out.println("a의 값 : " + a);  // 반복실행문 1에 해당
//            for (int j = 0 ; j < 5 ; j++ ){
//                b = j;           //b값 초기화
//                System.out.println("b의 값 : " + b );  // 반복실행문 2에 해당
//            }
//            System.out.println("--------b가 끝나 새로 a를 대입합니다--------"); //반복실행문 3에 해다으
//        }
        /*
            실행 예 : 구구단
         */


        for(int i = 2 ; i <= 9 ; i = i + 1 ){
            System.out.println("---- " + i + "단 ----");
            for(int j = 1 ; j <= 9 ; j = j + 1){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("\n");
        }





    }
}
