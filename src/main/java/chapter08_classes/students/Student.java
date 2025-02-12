package chapter08_classes.students;
/*
    1. Student 클래스의 필드를 정의하시오

        1) int studentCode
        2) String name
        3) double score

    2. 기본 생성자를 직접 작성하시고, 객체가 생성될 때
    "기본 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    3. int studentCode를 매개변수로 하는 매개변수 생성자를 생성하고,
    "int 매개변수 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    4. String name을 매개변수로 하는 매개변수 생성자를 생성하고,
    "String 매개변수 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    5. int studentCode, String name을 매개변수로 하는 매개변수 생성자를 생성하고,
    "int, String 매개변수 생성자로 객체가 생성되었습니다"라고 출력될 수 있도록 코드를 작성하시오.

    6. StudentMain 에서 해당 객체명과 속성을 가질 수 있도록 작성하시오.
        1) student1 20250001 / 김일 / 4.5         -> 기본 생성자로 생성할 것
        2) student2 20250002 / 김이 / 100         -> int 매개변수 생성자로 생성할 것
        3) student3 20250003 / 김삼 / 95.8        -> String 매개변수 생성자로 생성할 것
        4) student4 20250004 / 김사 / 4.0         -> int, String 매개변수 생성자로 생성할 것

    실행 예
    기본 생성자로 객체가 생성되었습니다
    int 매개변수 생성자로 객체가 생성되었습니다
    String 매개변수 생성자로 객체가 생성되었습니다
    int, String 매개변수 생성자로 객체가 생성되었습니다

    7. 학생의 정보가 출력될 수 있도록 하는 showInfo() 메서드를 call1() 타입으로 정의하시오.
    실행 예
    학번 : 20250001
    이름 : 김일
    점수 : 4.5


 */

public class Student {
    //1. 필드 정의
    int studentCode;
    String name;
    double score;


    //2. 기본 생성자 생성
    Student() {
        System.out.println("기본생성자로 객체가 생성되었습니다.");
    }

    //3. int studentCode 를 매개변수로 하는 매개변수 생성자 생성
    Student(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다.");
        this.studentCode = studentCode;   //this 의 의미는 객체명.속성명에서 객체명부분을 의미함
    }

    //4. String name 을 매개변수로 하는 매개변수 생성자 생성
    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다");
        this.name = name;
    }
    //5. int studentCode, String name 을 매개변수로 하는 매개변수 생성자 생성
    Student (int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체가 생성되었습니다");
        this.studentCode = studentCode;
        this.name = name;
    }


    void showInfo(){
        System.out.println("학번 : " + this.studentCode + "\n이름 : " + this.name + "\n점수 : " + this.score);
        System.out.println();
    }







}

