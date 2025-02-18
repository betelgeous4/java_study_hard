package chapter13_abstraction.abstract_class;

public abstract class Factory  {
    // 필드 선언
    private String name;

    public Factory(String name) {
        this.name = name;
    }
    /*
        추상 메서드의 정의
            : {}가 없다 // 구현부가 없다 // method body가 없다
            access modifier, return type 사이에 abstract를 삽입하면, 추상 메서드로 선언됨
            -> 선언을 했으면 public, class 사이에도 abstract 를 넣어줘야 오류가 나지 않는다.

            왜냐하면 추상 클래스란 추상 메서드가 '하나라도' 있으면 추상클래스이다.
     */
    public abstract void produce(String model);

    public abstract void manage();
    // 추상 메서드가 아니다. ( 구현부가 존재 )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다. \n 공장 이름 : " + name);
    }
}
