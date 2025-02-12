package chapter08_classes.students;
/*
    생성자를 자동생성하는 방법

    메뉴바(햄버거) 클릭 -> 코드 -> Generate(생성) -> constructor(생성자)
    단축키 : Alt + ins

    어떤 필드(속성)을 기준으로 생성자를 만들 지 선택하면 됨 (아무것도 선택하지 않으면(Select None/선택안함)
    복수 선택 시에는 복수의 매개변수를 가진 매개변수 생성자, Shift 누르고 만들기
 */
public class Student2 {
    int studentCode;
    String name;
    double score;
    // intelliJ 기준


    public Student2() { //select NONE
    }

    public Student2(int studentCode) {
        System.out.println("매개변수 생성자");
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        System.out.println("매개변수 생성자");
        this.name = name;
    }

    public Student2(int studentCode, String name) {
        System.out.println("매개변수 생성자");
        this.studentCode = studentCode;
        this.name = name;
    }





}
