package chapter11_arrays;

import java.util.Arrays;

/*
    현재까지 배운 대부분의 Java 클래서

    Scanner
    Arrays
    Integer
    Double
    Comparator
    String
    Random

    과제
    1. index 가 10개인 배열을 만들고, Math.random()을 활용해 값을 집어넣어라.
        : 1 이상 10 이하의 int 배열로 만들어서.

    2. 값이 입력된 배열을 출력
        1) 배열 전체 출력
        2) 각 요소에 10씩 곱해서 한 줄에 출력

    3. 해당 배열의 합의 크기를 구할 것

    4. 짝수만 출력해 합을 구할 것

    5. 배열을 오름차순으로 정렬해서 출력

    6. 배열을 내림차순으로 정렬해서 출력

 */
public class ArrayTest05 {
    public static void main(String[] args) {


//        double a = Math.random();      // 0.0 ~ 1.0 간의 난수 생성해서 반환
//        System.out.println(a);

        //#1.
        double[] numbers = {};
        for (int i = 0 ; i < 10; i++) {
            double num = Math.random();
            double realNumber = (num*10)%1;
            int k = 0;
            numbers[k] = (int) realNumber;
            k++;
        }
        //#2

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));

        //#3

        for(int i = 0 ; i < 10 ; i ++ ) {

        }





    }
}
