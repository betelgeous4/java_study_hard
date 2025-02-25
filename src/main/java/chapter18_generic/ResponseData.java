package chapter18_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {     //<- 자료형 여러개를 받아야 할 때 T
    private String message;
    private T data;
}
