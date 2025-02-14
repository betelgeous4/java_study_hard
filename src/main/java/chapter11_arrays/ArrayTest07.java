package chapter11_arrays;

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        // 빈 배열을 하나 선언
        int [][] numbers = new int [5][5];
        int num = 0;
        //1부터 25까지의 숫자를 numbers 배열에 순서대로 값을 넣어라
        for (int i = 0; i < 5 ; i ++ ){
            for (int j = 0; j < 5 ; j ++){
//                num = num + 1;
                numbers[i][j] = ++ num;
            }
            System.out.println(Arrays.toString(numbers[i]));
        }

        /*
            향상된 for 문 주의할 점
                향상된 for문은 기본적으로 배열의 요소를 "읽기"만 할 수 있고,
                 '배열의 인덱스 접근 및 수정' 에서는 사용이 어렵다.

         */



    }
}
