package chapter04_scanner;

import java.util.Scanner;

public class Scanner04_BMIcalc {
    public static void main(String[] args) {

        /*
            BMi 계산기

            1. 키를 cm로 입력받음
            2. 몸무게를 kg로 입력받음
            3. BMI : 몸무게/키^2
            4. 콘솔창에 "당신의 BMI 지수는 ~입니다"

         */
       // 클래스룸에 스캐너 임포트
       Scanner scanner = new Scanner(System.in);


        System.out.print("키(cm 단위로 입력하세요):");
        double height = scanner.nextDouble();
        height = height/100;
        //  cm를 m로 변환해야 함
        System.out.print("몸무게(kg 단위로 입력하세요):");
        double weight = scanner.nextDouble();

        //bmi 지수 산출을 위한 연산
        int bmi = 0;
        bmi = (int)(weight / (height*height));

        System.out.print("당신의 BMI지수는 " + bmi + "입니다");




















    }
}
