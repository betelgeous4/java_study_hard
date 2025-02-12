package chapter04_scanner;

import java.util.Scanner;

public class    Scanner01 {
    public static void main(String[] args) {
        // scanner 클래스 import
        Scanner scanner = new Scanner(System.in);      //콘솔창에 사용자가 값을 입력 가능
        //컨트롤 스페이스 누르면 scanner 나옴
        System.out.print("올해 연도를 입력하세요 >>> ");      //앞으로  print 와 println 구분
//        int year = scanner.nextInt();    //정수로 변수 선언 후 정수로 입력받음
//        //double year = scanner.nextDouble(); // 더블로 변수 선언 후 더블로 입력받음, 명령어에 관련한 부분은 추후 설명
//        System.out.println(year);

        /*
            int 입력하고 싶으면 scanner.nextInt();
         */

        String year1 = scanner.nextLine();
        System.out.println("올해 연도는 " + year1 + "입니다");
        System.out.println("올해 연도는 " + year1 + 1 + "입니다");
        // year1을 String 자료형으로 선언했기 때문에 수학 연산이 불가능해 2025를 입력했을 때 20251로 나옴

        /*
            scanner를 사용했을 때 그 결과값을 변수에 대입하는 경우 변수의 자료형이 매우 중요함

            scanner.nextInt / scanner.nextLine()을 이용하면 콘솔창에 사용자가 원하는 값을 입력 가능
            그리고 그 결과값을 각각 int year, String year1에 대입했다

            즉 결과값이 변수에 대입됐음을 의미 -> 대입연산자 개념을 떠올려야한다
            애초에 변수를 선언하며 어떤 자료형이 될지 미리 고려한다면 자동완성을 통해
            nextInt(), nextDouble(), nextLine()을 추천
         */




    }
}
