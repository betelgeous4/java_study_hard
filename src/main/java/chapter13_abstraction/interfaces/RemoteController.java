package chapter13_abstraction.interfaces;
/*
    이 부분에서 고려해야할 점은
    자바는 단일 상속만 가능하므로
    VolumeUp, VolumeDown, PowerButton 셋 중 하난만 상속 할 수 있을 것 같은데
    어떻게 세 버튼들의 메서드들을 전부 다 사용하게 작성할 수 있을까?
 */
public class RemoteController {
    //필드 선언 -> 이전까지는 Java의 기본 자료형만을 사용했지만
    // 이번에 처음으로 우리가 직접 정의한 클래스가 자료형이 되는 필드를 적용했다.
    private powerButton powerButton;
    private volumeUpButton volumeUpButton;
    private volumeDownButton volumeDownButton;

    public RemoteController(chapter13_abstraction.interfaces.powerButton powerButton,
                            chapter13_abstraction.interfaces.volumeUpButton volumeUpButton,
                            chapter13_abstraction.interfaces.volumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    // 메서드 구현
    // PowerButton 의 메서드를 구현
    public void onPressedPowerButton(){
        powerButton.onPressed();
    }

    // VolumeDownButton 의 메서드를 구현
    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    //VolumeUpButton 의 메서드를 구현
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }



}
