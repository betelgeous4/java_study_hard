package chapter05_condition;
    /*
        switch 문

        형식 :
         switch(변수)
            case 조건 1:
                실행문 1
                break;
            case 조건 2;
                실행문 2
                break;
            case 조건 3:
                실행문 3
                break;
            default:
                조건문 4
     */
import java.util.Scanner;



public class Condition05switch {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String selected = "";
        int selected2 = 0;

        System.out.println("메뉴를 선택하세요 : ");
        System.out.println();
//        selected = scanner.nextLine();
        selected2 = scanner.nextInt();
//        System.out.println("[   선택   프로그램   ]");
//        System.out.println("a: menu 1");
//        System.out.println("b: menu 2");
//        System.out.println("c: menu 3");
//        System.out.println("d: menu 4");
//        System.out.println("e: menu 5");


//        switch (selected) {
//            case "a":
//                System.out.println("menu 1 was chosen");
//                break;
//            case "b":
//                System.out.println("menu 2 was chosen");
//                break;
//            case "c":
//                System.out.println("menu 3 was chosen");
//                break;
//            case "d":
//                System.out.println("menu 4 was chosen");
//                break;
//            case "e":
//                System.out.println("menu 5 was chosen");
//                break;
//            default:
//                System.out.println("please choose menu");
//        }

        /*
            default : case 에 해당되지 않는 변수가 적용되었을 경우 실행되는 부분
            break :

         */
        System.out.println("[   선택   프로그램   ]");
        System.out.println("a: menu 1");
        System.out.println("b: menu 2");
        System.out.println("c: menu 3");
        System.out.println("d: menu 4");
        System.out.println("e: menu 5");

        switch(selected2) {
            case 1:
                System.out.println(" Menu 1 was chosen");
                break;
            case 2:
                System.out.println(" Menu 2 was chosen");
                break;
            case 3:
                System.out.println(" Menu 3 was chosen");
                break;
            case 4:
                System.out.println(" Menu 4 was chosen");
                break;
            case 5:
                System.out.println(" Menu 5 was chosen");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }

    }
}
