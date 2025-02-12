package chapter05_condition;

import java.util.Scanner;

public class Condition04BMIcalcupgrver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 정보 입력
        System.out.print("키(cm 단위로 입력하세요): ");
        double height = scanner.nextDouble();
        height = height/100;
        System.out.print("몸무게(kg 단위로 입력하세요): ");
        double weight = scanner.nextDouble();
        //키나 몸무게가 음수일 때

        //bmi 지수 산출을 위한 연산
        int bmi = 0;
        bmi = (int)(weight / (height*height));
        if(height<0 || weight<0)
        {
            System.out.println("잘못 입력하셨습니다");
        }
        //bmi 정도 구분을 위한 연산
        String stat = "";
        if(bmi>100 || bmi < 0){
            stat = "잘못 입력하셧습니다";
        } else if(bmi>25){
            stat = "비만";
        } else if(bmi>23){
            stat = "과체중";
        } else if(bmi>18){
            stat = "정상체중";
        } else stat = "저체중";


        System.out.println("당신의 키는 " + (height*100) + "cm이고 " +
                "몸무게는 " + weight +"kg입니다.\n 따라서 당신의 BMI 지수는 "+ bmi + " 이며, " + stat + "입니다. ");














    }
}
