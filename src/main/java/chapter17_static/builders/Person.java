package chapter17_static.builders;
/*

 */
public class Person {

    // 필드 선언
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age, String address) {
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
