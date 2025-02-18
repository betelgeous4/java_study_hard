package chapter13_abstraction.interfaces;

public class powerButton extends Button{
    //필드 선언
    private boolean status;
    private String name;


    @Override
    public void onPressed() {
        if(status) {    // status 가 true 라면 실행
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
