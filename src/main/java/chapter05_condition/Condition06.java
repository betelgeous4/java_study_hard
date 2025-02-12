package chapter05_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        /*
            사용자에게 점수를 입력받아 다음과 같은 조건을 만족시키도록 작성하시오.

            점수가 0보다 작거나 100보다 크면 등급은 X
            changedScore -> 9~10 이면 A등급
            changedScore -> 8 이면 B등급
            changedScore -> 7 이면 C등급
            changedScore -> 6 이면 D등급
            changedScore -> 5 이면 E등급
            changedScore -> 5 이하 이면 F등급

            IF 문을 사용해 0 미만과 100 초과를 걸러내는 작업 후
            나머지 부분을 switch 로 직접 작성

         */

        Scanner scanner = new Scanner(System.in);

        // #1. 변수 선언
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt(); // int score = 0;으로 작성한다면 ChangedScore 의 변수선언에서
        // 문제가 생김. 따라서 우항을 바로 스캔하면 문제가 발생하지 않는다
        int changedScore = score/10;
        String grade = "";
        if(changedScore>10 || changedScore<0){
            System.out.println("error404");
        } else {
            System.out.println("changedScore : " + changedScore);
        }

        // #2. 점수 입력 및 변환이 끝났으므로 조건문 작성(if - switch 통합)
        if(score<0 || score>100){
            grade = "X";

        } else { //여기서부터 switch 작성 가능
            switch (changedScore){
                case 10 :
/*
                    grade = "A";
                    break;            위 44번 45번 줄은 써도 되고 안 써도 됨 : CASE 내부에 무조건 식이 들어가야 하는 것은 아니다.
*/
                case 9 :
                    grade = "A";
                    break;
                case 8 :
                    grade = "B";
                    break;
                case 7 :
                    grade = "C";
                    break;
                case 6 :
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }

        }
        System.out.println("등급 : " + grade);


    }
}
