package chapter07_method;

import java.util.Scanner;

public class Method03switch {
    /*
    Method02.java 파일을 확인하면 별찍기 관련한 method 가 구현되어있다.
    getStar() 메서드를 보면 내부에 if - else if - else 형태의 구문으로
    매개변수를 1-4 까지 받아 왼 쪽으로 증가하는 별 등을 출력하게끔 구현되어있다.

    하지만 if 문을 사용하면 가독성이 떨어지기 때문에 이를 switch 문으로 교체 후
    동일한 기능을 하게끔 Refactoring(리팩토링)과정을 거치고자 한다.
     */

    // 별을 출력하기 위한 메서드 작성
    // 매개변수는 별의 줄 개수인 totalLine 과 메뉴 선택을 위한 menuSelect 로 지정하였다

    public static String getStar(int totalLine, int menuSelect){
        String result = "";
        //method02.java 파일의 if 문 부분을 switch 문으로 교체해 코드를 작성
        int gwayeon = 0;
            switch (menuSelect) {
                case 1:
                    for (int i = 0; i < totalLine; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            result += "*";
                        }
                        result += "\n";

                        break;
                    }
                case 2:
                    for (int i = 0; i < totalLine; i++) {
                        for (int j = 0; j < totalLine - i - 1; j++) {
                            result += " ";    // 혹시 공백 깨져보이면 공백 하나 더 넣어주세요
                        }
                        //별
                        for (int k = 0; k < k + 1; k++) {
                            result += "*";
                        }
                        result += "\n";
                    }

                    break;

                case 3:
                    for (int i = 0; i < totalLine; i++) {
                        for (int j = 0; j < totalLine - i; j++) {
                            result += "*";
                        }
                        result += "\n";
                    }

                    break;

                case 4:
                    for (int i = 0; i < totalLine; i++) {
                        for (int j = 0; j < i; j++) {
                            result += " ";
                        }
                        for (int k = 0; k < totalLine - i; k++) {
                            result += "*";
                        }
                        //개행
                        result += "\n";
                    }

                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.😅");
            }


        return result;
    }





    // 변수를 입력 받기 위한 메서드 작성
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice;
        String starResult;

        System.out.print("\n\n 몇 줄짜리 별을 생성할까요? >>>   ");
        rowOfStars = scanner.nextInt();
        System.out.println("\n\n");


        System.out.println("1. 왼 쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른 쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼 쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른 쪽으로 치우친 감소하는 별");
        System.out.print("메뉴를 숫자로 선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);



    }














}
