package chapter03_operator;
    /*
    논리 연산자

     true(1), false(0) : 컴퓨터가 읽을 수 있는 두 수치
     boolean : true / false를 구분하는 자료형

     AND(&&) : 곱 TxT = T , TxF = F , FxF = F -> 하나라도  false면 false
     OR(||) : 합 T+T = T , T+F = T, F+F = F -> 하나라도 true면 true
     NOT(!) : 값을 반대로 바꿔준다






    */
public class operator01 {
    public static void main(String[] args) {
//        boolean flag = false;
//        System.out.println(!flag);

        boolean flag1 = true;
        boolean flag2 = false;

        //And 연산자 사용 예시
        boolean result1 = flag1 && flag2;
        System.out.println("T x F = " + result1);

        boolean result2 = flag1 && flag1;
        System.out.println("T x T = " + result2);

        boolean result3 = flag2 && flag2;
        System.out.println("F x F = " + result3);

        boolean result4 = flag1 || flag1;
        System.out.println("T + T = " + result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);

        boolean result6 = flag1 || flag2;
        System.out.println("F + F = " + result6);

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F x T = " + result7);

        boolean result8 = 10%3 == 0; // a 와 b가 같다고 표시할 땐 == 사용
        System.out.println("10 % 3 == 0 ? : " + result8);

        boolean result9 = 10 % 3 != 0;
        System.out.println("10 % 3 != 0 ? : " + result9);



    }
}





