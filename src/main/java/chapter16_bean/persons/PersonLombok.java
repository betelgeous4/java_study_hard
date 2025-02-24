package chapter16_bean.persons;

import lombok.*;

import lombok.AllArgsConstructor;
//import lombok.@RequiredArgsConstructor;
//import lombok.@Setter;
import lombok.ToString;


public class PersonLombok {
        private final String name;
        private int age;

    public PersonLombok(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "이름 : " + name + "\n나이 : " + age + "\n";
    }











}