package chapter06_Loops;
/*
    While 반복문
    형식:
        while(조건식) {
            반복 실행문
        }

        while 뒤에 나오는 소괄호 안의 영역인 조건식을 보면 if(조건식) 형태와 유사함을 확ㅇ니할 수 있다.
        즉, while() 내의 조건식이 True 일 때, {}내의 영역이 반복실행된다.
 */
public class Loop06while {
    public static void main(String[] args) {
//        int n = 1;
//        while(n<101){
//            System.out.println(n);
//        } ==> 1이 반복적으로 출력됨

//        int n = 1;
//        while(n<101){
//            System.out.println(n);
//            n++; // <- 이 코드가 없음 무한루프에 빠지게 됨
//        }

        /*
            그래서 for 문을 쓸 때와 달리 while 문을 작성할 때의 유의할 점으로는 :

                for 문은 한계값을 for()내에 작성하지만 while 문은 그렇지 않기
                때문에 특정 시점에 조건식이 false 가 되게끔 개발자가 사전에 염두할 필요성이 있음
         */

// 1부터 5까지 합을 구하는 for 문과 while 문을 작성하시오.

//        int sum1 = 0;
//        for(int i = 0 ; i < 5 ; i ++){
//            sum1 += (i + 1);
//        }
//        System.out.println("\nfor 문을 통한 합: " + sum1);
//        int sum2 = 0;
//        int j = 0;
//        while(j <= 5) {
//            sum2 += j;
//            j++;
//        }
//        System.out.println("while 문을 통한 합: " + sum2);

        /*
            1 2 3 4 5 6 7 8 9 10
            11 12 ...
         */

        // for 문으로 작성하기
        System.out.println("for 문으로 작성 : \n");
        for (int i = 0; i < 10 ; i ++) {
            for(int j = i*10 +1 ; j <= (i+1)*10 ; j ++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        // while 문으로 작성하기
        System.out.println("while 문으로 작성 : \n");
        int n = 1;
         while(n < 101){
             System.out.print(n + " ");
             if(n/10 != (n-1)/10) {
                 System.out.println();
             }
             n++;
        }




    }
}
