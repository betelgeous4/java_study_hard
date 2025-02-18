package chapter13_abstraction.abstract_class;

public class PhoneFactory extends Factory {
    // 생성자나 메서드를 일일이 복사 및 타이핑할 필요가 없음 -> 빨간 줄 뜰 때마다 안내사항 참조 필요
    public PhoneFactory(String name) {
        super(name);
    }
    // Factory 클래스에 있던 추상 메서드인 produce 를 override 하니 구현부가 자동으로 생성되었다.
    // PhoneFactory 클래스에서 추상 메서드를 구현부가 있는 메서드로 "재정의" 해서 사용한다.
    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 모델 스마트폰을 생산합니다.");
    }
    // 구현이 강제됨 ( 하나라도 override 받지 않으면 오류가 발생한다 )
    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }
}
