package chapter10_access_modifier;

import java.util.Scanner;

/*
    접근 지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데 사용되는 명령어

    종류:
        1) public : 모든 클래스에서 접근 가능 -> setter / getter 자동 생성 때 public 으로
        2) protected : 같은 패키지 내의 클랫 ㅡ 및 이 클래스를 상속받은 자식 클래스에서 접근 가능
        3) default(package-private) : 접근 지정자를 명시하지 않으면 default 로 간주되며, 같은 패키지 내의 클래스에서만 접근 간으
        4) private : 같은 클래스 내에서만 접근 가능

        작성 가이드라인
            1. BankAccessModifier
                1) 필드
                    accountNumber(계좌번호, 정수)
                    accountHolder(예금주 이름, 문자열)
                    balance(잔액, 정수)
                    pinNumber(비밀번호, 4자리 정수)

                2) 생성자
                    기본 생성자
                    계좌 번호만 받는 생성자
                    계좌번호 예금주 받는 생ㅅ어자]
                    계좌번호 예금주 초기잔액 받는 생성자
                    계좌번호 예금주 초기잔액 비밀번호 받는 생성자

                3) 메서드
                    Setter / Getter
                        특히 Setter 의 경우에는 유효성 검증 로직을 삽입해야함
                            -> 잔액은 음수일 수 없다
                            -> 비밀번호는 0000~9999 -> 실패시 "불가능한 비밀번호입니다"

                        입출금 메서드
                            deposit(int amount , int inputPin) -> 입금
                                - 올바른 비밀번호인지 확인
                                - 유효한 금액인지 검증
                                - 콘솔창에
                                    입금 성공! 현재 잔액 : 1000000원

                            withdraw(int amount, int inputPin) -> 출금
                                - 올바른 비밀번호인지 확인
                                - 유효한 금액인지 검증(0보다 큰 값) -> 실패 시 "불가능한 금액입니다"
                                - 출금 후 잔액이 0 이상인지 확인
                                - 콘솔창에 출금 성공! 현재 잔액 : 40000원
                            showAccountInfo()
                                -콘솔창에
                                    ㅇㅇㅇ 님의 계좌번호느 1234567 이며, 현재 잔액은 ㅇㅇㅇ 입니다.

                            작성 중에 나름대로 BankAccessModifierMain 에 객체 생성해보고 되는지 안 되는지 다 검증.
 */
public class BankAccessModifier {
    //필드 생성
    int accountNumber;
    String accountHolder;
    private long balance;
    int pinNumber;
    int inputPin;
    private long amount;
    Scanner scanner = new Scanner(System.in);
    // 생성자
    //기본
    public BankAccessModifier() {
    }
    //계좌번호 받는 생성자
    public BankAccessModifier(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    // 계좌번호, 예금주명 받는 생성자
    public BankAccessModifier(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    // 계좌번호, 예금주명, 초기잔액 받는 생성자
    public BankAccessModifier(long balance, String accountHolder, int accountNumber) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
    // 계좌번호, 예금주명, 초기잔액, 핀번호 받는 생성자

    public BankAccessModifier(int accountNumber, String accountHolder, long balance, int pinNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    // Setter / Getter

    //예금주명

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    //계좌번호

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 잔액

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if(balance < 0) {
            return;
        }
        this.balance = balance;
    }

    // 비밀번호

    public int getPinNumber() {

        return pinNumber;
    }

    public void setPinNumber() {
        System.out.println("수정 전 비밀번호를 입력하세요.");
        inputPin = scanner.nextInt();
        if(inputPin == pinNumber) {

            System.out.println("비밀번호를 입력하세요. ");
            pinNumber = scanner.nextInt();
            if (pinNumber < 0 || pinNumber > 9999) {
                System.out.println("불가능한 비밀번호입니다!");
                return;
            }
            this.pinNumber = pinNumber;
        } else {
            System.out.println("비밀번호가 틀렸습니다!");
        }
    }

    public void deposit(){
        System.out.println("비밀번호를 입력하세요. ");
        inputPin = scanner.nextInt();
        if (inputPin != this.pinNumber){
            System.out.println("비밀번호가 잘못되었습니다.");
            return;
        } else {
            System.out.println("입금할 금액을 알려주세요");
            amount = scanner.nextInt();
            this.balance += amount;
            System.out.println("입금이 완료되었습니다.");
        }

    }

    public void withdraw() {
        System.out.println("비밀번호를 입력하세요. ");
        inputPin = scanner.nextInt();
        if (inputPin != this.pinNumber){
            System.out.println("비밀번호가 잘못되었습니다.");
            return;
        } else {
            System.out.println("출금할 금액을 알려주세요");
            amount = scanner.nextInt();
            if(this.balance - amount < 0) {
                System.out.println("출금할 수 없는 금액입니다.");
                return;
            }else {
                this.balance -= amount;
                System.out.println("출금이 완료되었습니다.");
            }
        }
    }

    public void showInfo () {
        System.out.println(accountHolder + "님의 계좌번호는 " + accountNumber + "이며, 잔액은 현재 " + balance + "원 남아있습니다.");
    }
}
