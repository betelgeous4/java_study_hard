package chapter17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
      //  Person person = new Person();
        // 이상의 필드는 오류가 발생한다. 생성자를 다 없애기도 했고,
        // Builder 내부에 Person 객체를 생성하는 build() 라는 메서드만 정의했다,

        Person person1 = new Person.Builder()
                .name("박동준")
                .age(21)
                .address("부산광역시 금정구")
                .build();                    // 빌더에선 속성앞에 점을 찍은 후 속성입력, 그 후 엔터를 치고 다른 속성을 추가

        System.out.println(person1);

        Person person2 = new Person.Builder()
                .name("김일")
                .build();                      // 필드들 중 선택적으로 한 두개의 필드만 채울 수 있다.

        Person person3 = new Person.Builder()
                .build();

        Person person4 = new Person.Builder()
                .age(32)
                .address("서울특별시 강남구")
                .name("김이")                   // 순서 또한 상관이 없음
                .build();
    }
}
