package chapter05_condition;
/*
    사용자에게  score 를 입력 받아 다음과 같은 조건을 만족시키도록 작성하라
    score 가 0보다 작거나 100보다 크면 x
    score -> 90~100, grade = A
    score -> 80~90, grade = B
    score -> 70~80, grade = C
    score -> 60~70, grade = D
    score -> 0~60, grade = E
 */

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int score = 0;

// #1. 조건문마다 sout 적용 :
        //점수 입력란
        System.out.print("점수를 입력하세요 : ");
        score = scanner.nextInt();
        System.out.println();
        System.out.println();
        //등급 출력란
        if(score>=90 && score<=100){
            System.out.println("입력한 점수는 " + score + "점이며 당신은 A등급입니다");
        } else if(score>=80 && score<=89){
            System.out.println("입력한 점수는 " + score + "점이며 당신은 B등급입니다");
        } else if(score>=70 && score<=79){
            System.out.println("입력한 점수는 " + score + "점이며 당신은 C등급입니다");
        } else if(score>=60 && score<=69){
            System.out.println("입력한 점수는 " + score + "점이며 당신은 D등급입니다");
        } else if(score>=0 && score<=59) {
            System.out.println("입력한 점수는 " + score + "점이며 당신은 F등급입니다");
        } else
            System.out.println("x");
// #2. grade 변수 선언한 후 대입 : 조건문이 끝난 후 sout 적용, 조건을 벗어나더라도 sout 출력됨
        String grade = "";
        if(score>=90 && score<=100){
            grade = "A";
        } else if (score>=80 && score<=89){
            grade = "B";
        } else if (score>=70 && score<=79){
            grade = "C";
        } else if (score>=60 && score<=69){
            grade = "D";
        } else if (score>=0 && score<=59){
            grade = "F";
        } else
            grade = "X";
        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "등급입니다.");










    }
}
