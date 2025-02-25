package chapter18_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class AnimalData<T> {
    private T animal;

    // AnimalData 객체를 생성했을 때, 필드에 들어가는 클래스가 무엇인지도 모르는 상황이다.
    // 특정한 클래스라면 해당 클래스에 맞는 객체 정보를 출력하도록 메서드를 작성할 예정
    public void printData(){
        ((Animal) animal).move();  //AnimalData 내의 멤버변수인 animal을 Animal 타입으로
        // 형변환하여 .move() 메서드 호출

        if(animal.getClass() == Human.class) {   //AnimalData 의 멤버변수인 animal은 현재
            ((Human) animal).read();             //  Animal 클래스로 형변환되어있는데, 그것이 Human 클래스에도 속해있다면,
            // Human 클래스로 다운캐스팅해 .read()메서드를 호출

        } else if (animal.getClass() == Tiger.class) {
            ((Tiger) animal).hunt();
        }
    }
}
