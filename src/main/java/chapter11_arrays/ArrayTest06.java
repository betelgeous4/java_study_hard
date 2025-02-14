package chapter11_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi Dimensional Array) 중 2차원 배열

    :다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상 2차원 배열 이상을 사용하는 경우는
    극히 드물기 때문에 2차원 배열을 기준으로 한다.

    형식 :

    int [][] arr01 = new int [크기][크기];              - 선언방식 1
    int [][] arr02 = new int [크기][];                 - 선언방식 2
    int [][] arr03 = { {1,2},{3,4},{5,6} };            - 선언방식 3 및 초기화

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 함.
        -> 2번 방식을 참조

    1열  2열
    ↓    ↓
   { 1 , 2 },  → 가로줄 :  행   1행
   { 3 , 4 },                 2행
   { 5 , 6 },                 3행


 */
public class ArrayTest06 {
    public static void main(String[] args) {
        int [][] arr03 = { {1,2},{3,4},{5,6} };
        //                 0번지   1번지  2번지
        System.out.println(Arrays.toString(arr03));
        System.out.println(Arrays.deepToString(arr03));

        //1차 배열의 element를 뽑는 방법 -> for 반복문
        //향상된 for문 예시
        for (int[] element : arr03 ) {
//            System.out.println(element);
            for(int number : element) {
                System.out.println(number);
            }
        }

//        for (int i= 0; i< arr03.length; i++){
//            System.out.print("{ ");
//            for(int j = 0; j < 2; j ++){
//                System.out.print(arr03[i][j] + " ");
//            }
//            System.out.print("}");
//            System.out.println();
//        }
// 컴퓨터가 코드를 작성하고 출력하는 방식이 사람들에게 항상 가독성이 있는 것만은 아님.
        int[][] arr02 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; //변수 선언 및 초기화
// 보통 이상과 같이 작성.














    }
}
