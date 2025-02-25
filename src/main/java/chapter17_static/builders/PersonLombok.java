package chapter17_static.builders;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@Setter
@Getter
public class PersonLombok {
    // 필드 생성
    private String name;
    private int age;
    private String address;


}
