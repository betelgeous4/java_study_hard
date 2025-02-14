package chapter11_arrays;

import java.util.Arrays;
import java.util.Comparator;

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
//        double[] numbers = {};
//        for (int i = 0; i < 10; i++) {
//            double num = Math.random();
//            double realNumber = (num*10)%1;
//            int k = 0;
//            numbers[k] = (int) realNumber;
//            k++;
//        }

//        int[] numbers = new int[10]; // Create an array of size 10
//        int k = 0; // Initialize k outside the loop to track the index
//        for (int i = 0; i < 10; i++) {
//            double num = Math.random();
//            double realNumber = (num * 10) % 1; // Get a fractional part after multiplying by 10
//            numbers[k] = realNumber; // Store the number in the array
//            k++; // Increment k to move to the next index
//        }

        Integer [] numbers = new Integer[10]; // 크기가 10인 배열을 생성

        // 10개의 랜덤한 정수를 배열에 저장
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 10); // 0 ~ 99 사이의 정수 생성
        }

        // 배열에 저장된 10개의 랜덤 정수 출력
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }


        //#2
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] * 10 + " ");
        }
        System.out.println();

        //#3 배열의 합

        int sum = 0;
        for (int i = 0; i < 10 ; i ++) {
            sum += numbers[i];
        }
        System.out.println("배열의 합은 : " + sum);

        //#4 짝수만 출력하기

        int sumEven = 0;
        for (int i = 0; i<10 ; i ++) {
            if( numbers[i] % 2 == 0){

                sumEven += numbers[i];
            }
        }
        System.out.println("\n배열 내의 짝수의 합 : " + sumEven);

        //#5 오름차순 정렬
        Arrays.sort(numbers);
        System.out.println("오름차순 정렬 : " + Arrays.toString(numbers));

        //$6 내림차순 정렬
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 : " + Arrays.toString(numbers));
    }
}