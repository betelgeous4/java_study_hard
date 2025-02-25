package chapter17_static.builders;

import lombok.ToString;

/*
    1. 빌더 패턴이란?
        빌더 패턴은 객체의 ㅅ생성 과정에서 '복잡한 생성자'를 대신해 객체를 단계적으로 생성할 수 있도록
        도와주는 디자인 패턴이다. GOF 디자인 패턴 중 하나로, 객체 생성 시 가독성과 유연성을 제공하는 것이 목표

    주요 특징 :
        1) 객체를 생성하는 여러 개의 필드를 '명시적'으로 관리할 수 있음
        2) 불필요한 생성자 오버로딩을 줄여 가독성을 높임
        3) 체이닝 메서드를 사용해 객체를 직관적으로 생성

    2. 빌더 패턴이 생기게 된 원인
        1) 복잡한 생성자 문제
            객체의 필드가 많아 질수록 생성자의 파라미터 수도 늘어남
        2) 생성자 오버로딩 문제 - 생성자에 필요한 조합이 다를 경우 수많은 생성자를 만들어야 함.
            -> 유지모수에 악영향 / 필드 하나 추가하면 생성자를 전부 다 고쳐야 한다는 문제
        3) 가독성과 유지보수
            코드를 작성하고 읽는 입장에서 객체를 생성할 때 어떤 값이 어떤 필드에 해당하는지가 명확하지 않아 실수를 유발할 수 있다
        -> 이상을 이유로 빌더 패턴의 개념이 생겨남
 */
public class Person {

    // 필드 선언
    private String name;
    private int age;
    private String address;
//
//    public Person() {
//    }
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(int age) {
//        this.age = age;
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person(int age, String address) {
//        this.age = age;
//        this.address = address;
//    }
//
//    public Person(String name, int age, String address) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }
    // 위의 코드가 너무 길고 번거로워 빌더 패턴이 생겨났다.
    // 여기서부터 빌더 패턴의 구성을 위한 코드이다
    private Person(Builder builder){
        // 접근 지정자가 private 이기 때문에 객레 생성이 불가능함
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    // 위 코드를 보면 builder 클래스의 객체인 builder 의 인스턴스 변수인 name, age, address 를
    // Person 객체의 인스턴스 변수 name, age, address 에 대입하는 구조이다

    // 객체를 생성하는 Main 단계에서 Builder 를 통해 Person 객체를 생성할 것이기 때문에 public
    @ToString
    static class Builder{
        // Builder 클래스의 필드 선언
        // 상위 클래스의 필드와 동일해야 한다.

        private String name;
        private int age;
        private String address;

        // Builder 클래스의 메서드 정의
        // 중요한 점은 메서드명인데, 수업 중 메서드명은 동사라고 얘기 했지만,
        // 여기에서는 Person 의 필드명과 동일하게 작성되어질 예정이다.

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        // 최종 Person 객체 생성 메서드
        public Person build(){
            return new Person(this);
        }
    }


}
