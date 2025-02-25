package chapter18_generic.wildcard;
/*
    와일드카드(wildcard)
        : 와일드카드는 제네릭 타입을 좀 더 유연하게 사용할 수 있도록 보조하는 역할로,
            표기 방식 -> '?'
        1. 상한 경계 와일드카드
            <? extends T> : T의 하위 타입만 허용
        2. 하한 경계 와일드카드
            <? super T> : T의 상위 타입만 허용
 */
public class Main {

    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        }else if (flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }

        return null;  //Human, Tiger 모두 아니라면 null 리턴
    }



    public static void main(String[] args) {
//        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
//        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
//        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
//        // 15번 라인에서 오류가 발생하지 않음 -> 제네릭은 어떤 클래스든 들어갈 수 있기 때문
//
//        animalData1.printData();
//        animalData2.printData();
//        animalData3.printData();// Car 을 Animal 로 형변환하려고 하려해 오륙 발생
//        // 여기서 문제점은 PrintData()를 무조건 호출해봐야 오류가 발생하는 것 알 수가 있다는 것
        // 이상의 코드는 와일드카드 적용 전

        // Main 클래스의 객체 생성
        Main main = new Main();

        AnimalData<? extends Animal> animalData3 = main.getAnimal(1);
        AnimalData<? extends Animal> animalData4 = main.getAnimal(2);
        AnimalData<? extends Animal> animalData5 = main.getAnimal(3);
        // 이상의 코드는 Main에 있는 getAnimal() 메서드를 통해 간접적으로 Human 객체 및
        // Animal 객체를 생성하는 과정이라고 볼 수 있다.

        if (animalData3 != null) {
            animalData3.printData();
        }
        if (animalData4 != null) {
            animalData4.printData();
        }
        if (animalData5 != null) {
            animalData5.printData();    // 실행되지 않음
        } else {
            System.out.println("animalData5는 NULL 입니다.");
        }
    }
}
