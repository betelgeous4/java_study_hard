package chapter08_classes.car;

public class CarMain {
    public static void main(String[] args) {


        Car myCar = new Car();
        Car yourCar = new Car();


            myCar.color = "빨간색";
            myCar.speed = 100;
            yourCar.color = "노란색";
            yourCar.speed = 140;

        System.out.println(myCar.color);
        System.out.println(myCar.speed);
        System.out.println(yourCar.color);
        System.out.println(yourCar.speed);

        myCar.drive();
        yourCar.stop();




    }
}