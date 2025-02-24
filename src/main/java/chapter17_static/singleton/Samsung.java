package chapter17_static.singleton;

import lombok.Getter;

public class Samsung {
    @Getter
    private String company;
    private static int serialNumber;

    // 싱글톤 패턴 작성 시작
    // 1. 스태틱 변수 정의 ->
    private static Samsung instance = null; //자료형이 Samsung 인 정적 변수

    //2. 기본 생성자 정의
    private Samsung() {
        company = getClass().getSimpleName();  // 패키지이름을 뗀 클래스명만 가지고 옴
        //-> 이 필등네 게터 없음
        serialNumber = 20250000;
    }

    // 3. static 메서드 정의 -> 대부분의 경우 getInstance() 로 정의
    public static Samsung getInstance() {
        if (instance == null) {           // 현재 인스턴스가 없다면 이하의 코드가 실행됨
            instance = new Samsung();     // Samsung 클래스의 객체 생성
        }                                 // static 변수인 instance 에 대입
        return instance;
        // 만약 이상의 조건문이 실행되지 않는다면 이미 기존의 instance 가 있다는 의미
        // 즉, getInstance() 메서드는 실행되기만 하면 어쨌든 Samsung 클래스의 객체가 리턴된다고 볼 수 있다.
    }
    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }
}
