package chapter05_condition;

/*
            3. if - else if - else : else문과 달리 else if에는 별도의 조건식이 요구된다.

            형식:
            if(조건식 1){
                실행문 1
            } else if(조건식 2){
                실행문 2
            } else if(조건식 3){
                실행문 3
            } else {
                실행문 4
            }
         */

import java.util.Scanner;

public class Condition02 {
    public static void main(String[] args) {

    //1. 스캐너 클래스 임포트
        Scanner scanner = new Scanner(System.in);

        //2. 사용할 변수 및 상수 선언 및 초기화

        int point = 0;
        final int VIP = 80;
        final int GOLD = 60;
        final int SILVER = 40;
        final int BRONZE = 20;

        System.out.println("회원 포인트를 입력하세요 >>> ");
        point = scanner.nextInt();

        if(point > VIP) {
            System.out.println("등급 : VIP");
        } else if(point > GOLD) {
            System.out.println("등급 : GOLD");
        }else if(point > SILVER) {
            System.out.println("등급 : SILVER");
        }else if(point > BRONZE) {
            System.out.println("등급 : BRONZE");
        } else {
            System.out.println("등급 : GREEN");
        }

        /*

            System.out.println("회원 포인트를 입력하세요 >>> ");
            int point = scanner.next();

            이전까지의 방식에선 위와 같은 방식처럼 처음 사용될 때 선언 및 초기화를 했다. 그런데 왜 이번에는
            위에 먼저 선언해놓고 재대입하는 방식으로 작성을 했을까?
            다른 사람들과 협업을 염두에 두고 사용되는 클래스 및 변수들을 초반부에 전부 선언한 뒤 실제로 사용할 때
            재대입을 하는 방식으로 작성하는 것이 가독성을 염두에 둔 코드라고 할 수 있을 것이다.

         */
































    }
}
