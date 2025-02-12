package chapter04_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("x 입력 : ");
        int y = scanner.nextInt();
        System.out.print("y 입력 : ");
        System.out.println("x+y=" + (x + y));
        // y에 해당하는 값이 스트링으로 처리되므로, 그에 따른 문제를 해결하기 위해 괄호를 쳐줌
















    }
}
