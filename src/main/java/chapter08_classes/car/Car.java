package chapter08_classes.car;
// ClassA에 적은 내용을 바탕으로 Car 클래스를 정의
public class Car {
    String color;
    int speed;

    void drive(){
        System.out.println(color + " 자동차가 " + speed + "km/h로 주행중입니다,");
    }

    void stop(){
        System.out.println(color + " 자동차가 멈췄습니다.");
    }






}
