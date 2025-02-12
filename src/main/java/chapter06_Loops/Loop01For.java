package chapter06_Loops;
/*
    반복문 :
        for 반복문
            1) 일반 For 문
            2) 향상된 For 문
            3) While 반복문
 */
public class Loop01For {
    public static void main(String[] args) {

        /*
            for 반복문
                : 대부분의 경우엔 명확한 횟수가 고정되어 있을 때 사용함

            형식:
                for( 시작값 ; 종료값 ; 증감값 ){
                    반복 실행문
                }
         */
//        for ( int i = 1 ; i<=10 ; i++) {
//            System.out.println(i);

//          for ( int i = 0 ; i < 10 ; i++) { // int i가 0인게 좋음
//              System.out.println(i+1);
//        }

        /*
            1부터 100까지의 합을 구하시오
         */

    int sum = 0;
    for (int i = 0 ; i < 101 ; i = i + 1) {
        sum = sum + i; //sum 의 초기값이 0이고, 인수 i를 sum 에 0에서 100까지 1씩 늘려가며 반복하여 더한다.
    }
        System.out.println("1부터 100까지의 합 : " + sum);




    }
}
