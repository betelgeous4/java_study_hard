package chapter04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            문자열 입력
            scanner.next()  -> 띄어쓰기 포함 x
            scanner.nextLine()   -> 띄어쓰기 포함
         */

        Scanner scanner = new Scanner(System.in);
//        System.out.println("당신의 이름을 입력하세요 >>> ");
//        String name = scanner.next();
//        System.out.println("당신의 이름은 " + name + "입니다.");

        /*
            실행 예

            이름을 입력하세요 >> 이름
            주소를 입력하세요 >> 주소(시, 구까지)
            나이를 입력하세요 >> 나이

            이름: 이름
            주소: 주소
            나이: 나이
            내년 나이: 나이 + 1

            변수명: name, address, age로 고정
         */

//        System.out.print("이름을 입력하세요 >>> ");
//        String name = scanner.next();
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.print("주소를 입력하세요 >>> ");
//        String address = scanner.nextLine();
        /*
        35-38라인에서 의도대로 실행되지 않음
        nextLine()은 띄어쓰기를 허용하는데 엔터키를 기준으로 입력문을 받아들인다.
        nextInt() 작성 이후에 엔터를 하면 38라인에서 엔터가 실행되지 않음
         */

        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요 >>> ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 47번 라인에서의 엔터를 막아주는 배리어 역할
        //-> 변수에 대임하지 않았으므로 저장되지 않음
        System.out.print("주소를 입력하세요 >>> ");
        String address = scanner.nextLine();

        System.out.println(); // 한줄 띄어쓰기
        System.out.println("이름 : " + name );
        System.out.println("주소 : " + address );
        System.out.println("나이 : " + age );
        int next_age = age += 1;
        System.out.println("내년 나이 : " + next_age);
        // or System.out.println("내년 나이 : " + (age + 1));

        //  \n: 다음 줄로 강제 개행해주는 명령어로 위 sout x 4 해도 되고 아래 코드처럼 사용해도 됨
//        System.out.println("이름 : " + name + "\n주소 : " + address + "\n나이 : " + age + "\n내년 나이 : " + next_age);

        /*
            next() vs nextLine()
            1. 입력 단위 : 전자는 공백 이전까지의 단어를 읽고, 후자는 줄바꿈 이전까지의 전체 문자열을 읽는다
            2. 1로 인한 문제점 : next() 다음에 nextLine()을 혼합하여 쓸 때, next()입력 후 엔터키로 인해
            nextLine()의 입력이 무시되고 다음 코드라인을 읽어들이며 빈 문자열만 저장되어 변수에 아무것도
            저장되지 않을 수 있다.
            3. 해결방안: 2는 자바 상에서 대표적인 스캐너관련 문제로, 이를 막기 위해 엔터키를 흡수해주는
             배리어를 코드라인으로 삽입할 필요가 있음. <- scanner.nextLine();
         */

    }
}
