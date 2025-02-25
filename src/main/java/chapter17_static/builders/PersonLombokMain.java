package chapter17_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("김일")
                .age(19)
                .address("부산광역시 부산진구")
                .build();         //lombok 사용하면 소문자로 불러옴

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();

        person2.setAge(89);
        person2.setAddress("경상남도 양산시");

        PersonLombok person3 = PersonLombok.builder()
                .name("김삼")
                .age(21)
                .build();
        person3.setAddress("광주시 북구");

        PersonLombok person4 = PersonLombok.builder()
                .name("김사")
                .age(39)
                .address("서울특별시 마포구")
                .build();



        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

    }
}
