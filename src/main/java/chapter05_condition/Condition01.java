package chapter05_condition;

public class Condition01 {
    public static void main(String[] args) {

        /*
            조건문

            if문: if 다음에 있는 () 내의 조건문이  True 일 때, {} 내의 실행문이 실행됨. false면 실행 안됨

            형식 :
            if(조건식) {     조건식 : true / false 로 결론이 날 수 있는 식 혹은 문장
                실행문
            }

            2. if - else문 : if 다음에 있는 () 내의 조건식이 true 일 때는 if에 종속된 {}내의 실행문이 실행됨.
            false면 else에 종속된 {}내의 실행문이 실행됨.

            형식:
            if(조건식) {
                실행문 1
            } else {
                실행문 2
            }

         */

//        int num = 10;
//        if (num>0) {
//            System.out.println("num은 양수입니다.");
//        }

        //if - else문
        int num = 10;
        if(num>0){
            System.out.println("num은 양수입니다");
        } else {
            System.out.println("num은 양수가 아닙니다");
        };





    }
}
