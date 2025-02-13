package chapter11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력

    이전 수업에서 sout 을 이용해 출력하게 되면 배열은 참조 변수이기 때문에
    주소값만 출력된다는 점을 확인했다. 그리고 반복문을 통해 element 를
    불러올 수는 있지만 배열 전체를 출력하는 방법은 이번 수업에서 배울 수 있을 것이다

    Array 클래스를 사용하고, 정적 메서드, .tostring(배열명)을 사용하면 배열 전체를
    출력할 수 있다. 클래스명.메서드명()이라는 점에 주목해야 한다 -> scanner.nextInt()와
    차이가 있는 상황 toString()이라는 메서드도 추후에 사용할 메서드이다.

    여기서 기억해야 할 점은 동일한 메서드 명이라고 하더라도 어떤 클래스에 종속되어 있는가에 따라
    다른 결과값을 가질 수 있다는 점이다.
 */
public class ArrayTest04 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int num = random.nextInt();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(num);
//        System.out.println("임의의 숫자를 입력하세요");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);


        int[] arr01 = new int[10];

        for (int i = 0 ; i < arr01.length ; i ++) {
            arr01[i] = (i+1);
            //element 출력
            System.out.println((i+1) + " ");
        }

        // enhanced for loop 를 이용해 1 2 3 4 5 .. 10 을 출력하라

        System.out.println();
        for (int num : arr01) {
            System.out.print(num + " ");
        }
        System.out.println();
        //배열 전체 출력 방법
        System.out.println(Arrays.toString(arr01)); // 클래스명.toString() - argument 로 배열명

        Integer [] arr02 = {6,3,7,1,5,4,2,8,9,10};
        System.out.println("정렬 전 배열 : " + Arrays.toString(arr02));

        //오름차순 배열
        Arrays.sort(arr02);         //대부분의 경우 메서드를 사용하고 나면 그것을 변수에 대입했지만
                                    // sort()의 경우 arr02의 순서를 전부 갈아버리기 대문에 인덱스
                                    // 넘버에 따른 결과도 달라짐
        System.out.println("정렬 후 배열 : " + Arrays.toString(arr02));

        // 내림 차순 배열
        Arrays.sort(arr02, Comparator.reverseOrder());
        // 오름 차순 시에 사용했던 sort()와 마찬가지로 배열 자체 순서를 전부 바꿉니다.
        System.out.println("내림 차순 배열 : " + Arrays.toString(arr02));
        // Comparator.reverseOrder() 메서드를 적용하기 위해선 T[]라는, 제네릭이라는 개념이 필요하다.
        // T에 해당되는 것은 기본 자료형은 불가능하고, 클래스여야만 하기 때문에 int 라는 기본 자료형으로
        // 만들어진 arr02는 오류가 발생하여, Integer[]의 형태로 교체하였다.



    }
}
