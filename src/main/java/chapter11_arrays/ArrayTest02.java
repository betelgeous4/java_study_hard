package chapter11_arrays;

import java.util.Scanner;
/*
    String[] names 배열을 선언하고, 출석부에 이름을 입력해 names 배열에 집어넣는 프로그램을 작성
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//       String[] strArray01 = {"이런" + "식으로" + "쓸 수" + "있다"};

        //사용할 변수 선언

        int num;
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        num = scanner.nextInt();
        scanner.nextLine();               // 엔터키 한 번 막아주는 배리어 역할


        // 위에서 String[]을 선언한 상태이지만 비어있기 때문에 index 넘버가 없는 상황
        String[] names = new String[num];

        // 입력하는 반복문
        for(int i = 0; i < num ; i ++) {
            System.out.print((i+1) + "번 학생 이름 : ");
            names[i] = scanner.nextLine();
        }
        System.out.println();
        System.out.println("[ 출력 결과 ]");
        for (int k = 0; k < names.length ; k ++) {
            System.out.println((k + 1) + "번 학생 : " + names[k]);
        }








    }
}
