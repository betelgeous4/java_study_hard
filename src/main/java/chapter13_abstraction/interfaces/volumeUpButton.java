package chapter13_abstraction.interfaces;
/*
    동일한 onPressed() 라는 메서드를 사용하는데 어떨 때는 볼륨이 한 칸 내려가고, 어떨 때는 볼륨이 한 칸 올라간다.
 */
public class volumeUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("음량을 계속 올립니다.");
    }
}
