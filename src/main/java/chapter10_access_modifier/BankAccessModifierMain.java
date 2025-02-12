package chapter10_access_modifier;


import java.util.Scanner;

public class BankAccessModifierMain {
    public static void main(String[] args) {

        //계좌번호와 이름 입력받기
        Scanner scanner = new Scanner(System.in);

        BankAccessModifier customer01 = new BankAccessModifier();
        System.out.print("계좌번호를 입력하세요 >>> ");
        int number = scanner.nextInt();

        Scanner scanner01 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 >>> ");
        String name = scanner01.nextLine();

        System.out.print("네 글자 비밀번호를 입력해주세요 >>> ");
        int pin = scanner.nextInt();
        System.out.println("\n\n");

        customer01.accountNumber = number;
        customer01.accountHolder = name;
        customer01.pinNumber = pin;

        // 메뉴창
        int num = 0;
        int menu;
        while (num == 0) {
            System.out.print("""
                    ----메뉴------
                    원하시는 메뉴창의 번호를 입력해주세요
                    1. 계좌 상태 보여주기
                    2. 계좌 입금
                    3. 계좌 출금
                    4. 비밀번호 변경
                    
                     종료하시려면 아무 숫자나 누르세요\
                    
                     숫자 입력하기 >>> \s""");
            menu = scanner.nextInt();
            if (menu == 1) {
                System.out.println("\n");
                customer01.showInfo();
            } else if (menu == 2) {
                System.out.println("\n");
                customer01.deposit();
            } else if (menu == 3) {
                System.out.println("\n");
                customer01.withdraw();
            } else if (menu == 4) {
                System.out.println("\n");
                customer01.setPinNumber();
            } else {
                System.out.println("\n이용해 주셔서 감사합니다");
                num = 1;
            }
            System.out.println("\n\n");
        }
    }
}
