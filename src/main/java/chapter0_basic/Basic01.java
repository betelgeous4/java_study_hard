package chapter0_basic;
// 주석(Comment) : 한 줄 주석을 위해선 //
/*
    다중 주석(Multiple Comment) : 다중 주석을 위해선 /* + enter 누르면 그 사이에 작성했을 때 전체가 주석처리 됨

    주석이란: 자바 프로그램의 경우 폴더 및 파일 전체의 코드를 컴파일링(컴퓨터 계산을 해 오류가 없는지 검증)하게 되는데,
            거기서 오류가 하나라도 발생되면 실행 자체가 되지 않는다. 하지만 주석 처리를 한 부분에 대해선 컴퓨터가
            코드로 인식하지 않기 때문에 컴퓨터에 오류가 발생하지 않는다.

                    1) //
                    2) / + shift + 8
                    3) 사후주석: 주석 처리할 부분을 드래그한 후 컨트롤 슬래시
       프로잭트/패키지/클래스
       프로젝트: 패키지들이 모여있는 가장 큰 사이즘이며 주로 프로그램 하나를 의미
       패키지: 클래스들이 모여있는 일종의 디렉토리 -> 소문자로 작성필요
       클래스: 파일 단위로 코드를 작성하는 공간 -> 첫 문자는 대문자로 작성

       Main.java -> 당분간 실행될 프로그램인 경우에 해당 이름을 붙일 예정

       shift + f10 실행
       sout + enter
 */







public class Basic01 {
    public static void main(String[] args) {

        System.out.println("Hello, Java!:D");

//        System.out.println(Hello, java~! );  -> error
        System.out.println(1);            // 숫자는 큰 따옴표를 붙이던 말던 상관 없음,결과값 1
        System.out.println("1");          // 결과값 1
        System.out.println("1" + "2");    // 결과값 12
        System.out.println(1+2);          // 결과값 3
        System.out.println(2+1);          // 결과값 3
        System.out.println("2" + "1");    // 결과값 21

        /*
            수학  연산을 할 때에는 ""로 묶지 않는다.
            문자를 출력하기 위해선 ""로 묶어준다.

            자바 우클릭 ->  new -> package -> chapter01_variable
            chapter01_variable -> new ->
         */






    }
}