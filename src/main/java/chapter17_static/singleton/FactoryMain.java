package chapter17_static.singleton;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");


        // SmartPhone 의 객체 생성
        // 싱글톤 패턴을 사용하고, 팩토리 객체를 통한 스마트폰 객체 생성
        SmartPhone smartPhone1 = factory1.produceSmartPhone();
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();

        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);

    }
}
