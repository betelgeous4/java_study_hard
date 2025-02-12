package chapter08_classes; //정의하는 부분과 실행시키는 부분을 달리 할 것

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {

        //ClassA를 import -> Scanner 할 때와 코드가 비슷함
        //객체 생성 방식
        ClassA classA1 = new ClassA();      //객체 생성
        //클래스명 객체명 = new 클래스명 ();    //클래스명 뒤 왜 ()가 붙는지는 추후 설명

        Scanner scanner = new Scanner(System.in);       // -> 여태까지 써왔던 것이 Scanner 크래스의
                                                        // instance 인 scanner 를 사용해온 것
        Scanner sc = new Scanner(System.in);

//        System.out.print("이름을 입력하세요 : ");
//        //classA1 객체의 속성에 name 이라는 속성에 값을 대입
//        classA1.name = scanner.nextLine(); // ClassA.java 파일에서 다음 두 변수들을 정의했기
//        System.out.print("나이를 입력하세요 : ");               // 때문에 바로 각각의 자료형에 맞게 뜸
//        classA1.num = scanner.nextInt();
//
//        System.out.println("이름 : " + classA1.name);
//        System.out.println("나이 : " + classA1.num);

        //이상의 코드에서 확인할 수 있는 부분
        //특정 객체의 속성을 참조하기 위해선 '객체명.속성명'
        //메서드 호출 방법
        classA1.name = "박동준"; // 스캐너만 쓰는게 아니라 속성에 값 대입 가능
        classA1.callName();

        /*
            ClassA인 인스턴스인 classA2를 생성하고,
            name/num 에 각자의 이름, 나이를 넣고 score = 4.5를 입력, 스캐너를 사용해 작성


         */

        //객체 생성
        ClassA classA2 = new ClassA();
        //속성에 값 대입
        System.out.println("이름을 입력하세요 : ");
        classA2.name = scanner.nextLine();
        System.out.println("나이를 입력하세요 : ");
        classA2.num = scanner.nextInt();
        System.out.println("점수를 입력하세요 : ");
        classA2.score = scanner.nextDouble();

        System.out.println("ClassA2의 이름은 " + classA2.name + "이고, " +
                "나이는 " + classA2.num + "살입니다. 이번 학기의 점수는 " + classA2.score + "입니다.");

        //메서드 호출
        classA2.callName();



    }
}
