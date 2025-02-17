package chapter12_inheritance;
/*
    Tiger.java 에서처럼 Animal 클래스를 상속받고,
    생성자 및 getter / setter 다 정의한 후
    Animal 클래스의 move() 메서드를 오버라이딩 해서
    "사람이 두 발로 걷습니다"를 출력할 수 있도록 재정의 하고

    Main.java 에서 human1 객체를 생성한 후, setter 을 이용해 이름, 나이를 입력,
    getter 을 활용해 제 이름은 ___이고 나이는 ___살입니다 라고 출력

    Human 클래스의 고유 메서드로 read("멘토 자바")를 정의해 콘솔창에 출력
 */
public class Human extends Animal{   //클래스 상속

    //생성자
    public Human() {

    }
    //getter / setter
    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");

    }

    public void read( String bookTitle){
        System.out.println(bookTitle + "을 읽고 있습니다.");
    }
}
