package chapter02_conversion;

public class Conversion01 {
    public static void main(String[] args) {  //  소문자로 main 치고 엔터
        /*
            형변환(conversion): 용량상의 문제로 일어나는 이슈를 해결하기 위해서 사용

            1. 업캐스팅(upcasting): 더 큰 용량의 자료형으로 변환 시키는 것

         */

        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅의 방법 #1
        // 형변환 하기 위해선 '(바꿀 자료형) 변수명'으로 작성.
        System.out.println("변형" + (int) cast1);
        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int) cast1);

        //업캐스팅 방법 #2
        char cast3 = 'b';
        //업캐스팅을 징행할 새로운 변수를 선언해 대입
        int cast4 = (int) cast3;
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + cast4);

        //2. 다운캐스팅(downcasting) : 더 작은 용량의 자료형으로 변환시키는 것
        int cast5 = 99;
        int cast6 = 100;

        System.out.println("원형 : " + cast5);
        System.out.println("변형 : " + (char) cast5);

        char cast7 = (char) cast6; //새로운 변수 선언
        System.out.println("원형 : " + cast6);
        System.out.println("변형 : " + cast7);

        //지시사항: 다운캐스팅하는 방법을 업캐스팅 방식 1, 2를 동원해 char로 바꾼 후 콘솔창에 원형 변형 출력

        /*
            Upcasting의 경우 메모리 용량이 커지기만 하는 거기 때문에 기본적으0로 '암시적(implicit)'으로 변형 가능,
            downcasting의 경우 용량이 작아지기 때문에 메모리 용량을 벗어나게되는 경우가 있다. long으로만 표현 가능한데
            int로 바꾸는 경우가 이에 해당한다.
            그렇기 때문에 다운캐스팅을 할 때는 '명시적'으로만 진행한다.
         */

        //연산자
// 변수 선언 및 초기화
/*        int i = 10;
        System.out.println(i);

        //대입 연산자 : "=" : 우항의 데이터를 좌항에 대입한다는 의미
        i = i+1;         //변수명 i에 10(기존 i에 대입되었던 데이터) + 1해서 재대입
        System.out.println(i);
*/
        /*
            복합 대입 연산자
            1. +=
            2. -=
            3. *=
            4. /=
         */
        //변수선언 및 초기화
/*        int num = 1;
        System.out.println(num);
        num+=2; // num = num + 2
        System.out.println(num);
        num -=1;   // num = num - 1
        System.out.println(num);
        num*=10;   // num = num * 10
        System.out.println(num);
        num/=5;    //num = num / 5
        System.out.println(num);
*/

/*    int j = 10;
         System.out.println(j); // 10
         System.out.println(j++); // 출력값: 10 , 변수명++ : 코드를 실행시킨 후에 1을 더함
         System.out.println(j); // 11
         System.out.println(++j); // 12, ++변수명 : 코드를 실행시키기 전 1을 더한 후 코드를 실행
         System.out.println(j); // 12
         System.out.println(j--); // 12  변수명-- : 코드를 실행시킨 후에 1을 뺌
         System.out.println(j); // 11
         System.out.println(--j); // 10  --변수명 : 코드를 실행시키기 전 1을 뺀 후 코드를 실행
         System.out.println(j); // 10
*/
        /*
            일반 수식 연산자
            + - * /
            % : 나머지 연산자  ->예시:  특정 숫자가 홀수인지 짝수인지 구분할 때 사용
         */
/*
        System.out.println("10/2의 나머지 : " + 10%2); // 0
        System.out.println("10/4의 나머지 : " + 10%4); // 2
*/








    }
}