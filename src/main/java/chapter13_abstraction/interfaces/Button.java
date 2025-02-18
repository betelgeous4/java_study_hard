package chapter13_abstraction.interfaces;
/*
    인터페이스는 일반 클래스와 달리 다중 상속이 가능하다
    그렇기 때문에 일반 클래스와 상속 관련 명령어도 다르다
    extends(일반 클래스 상속 시)
    implements(인터페이스 상속 시)
 */
public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {

    }
}
/*
    PowerButton.java 에서 확인할 수 있듯이, 파워 버튼은 전원을 켜고 끄는 것만 하는 상황이므로,
    onUp(), onDown() 메서드를 굳이 Override 할 필요가 없다.
    하지만 abstract 로 선언한 메서드는
    반드시 자식 클래스에서 구현되어야 하므로, onUp(). onDown() 메서드들을 abstract 로 선언하면
    PowerButton 클래스에 불필요한 Methods 들을 구현해야 하므로 onPressed 만 abstract 로 선언했다.
 */