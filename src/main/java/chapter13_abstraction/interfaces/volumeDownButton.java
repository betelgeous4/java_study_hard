package chapter13_abstraction.interfaces;

public class volumeDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        super.onDown();          // 슈퍼 클래스의 메서드를 호출하는 키워드
        // 근데 구현한 게 없어서 있든 없든 상관 없음.
        // 그리고 VolumeUpButton 에서는 없애서 비교
        System.out.println("음량을 계속 내립니다.");
    }
}
