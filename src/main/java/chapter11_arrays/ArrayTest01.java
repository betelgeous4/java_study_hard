package chapter11_arrays;
/*
    배열의 필요성
        여태까지의 수업을 기준으로 하면 10개의 정수형 데이터를 저장하려면
        int 변수를 10개 선언해서 저장해야 했다.
        배열은 '같은' 자료형의 데이터를 하나의 변수에 저장해 처리하는 방식이다
            -> 추후, 다른 자료형을 하나의 변수에 저장하는 방식도배울 예정

        선언 방식 :
        자료형[] 변수명 =

        int [] arr1 = new int[5];            // 배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
        int [] arr2 = {1, 2, 3, 4, 5};       // 배열 선언 방식 2 -> 배열 선언 및 초기화

        s out(arr1)등을 통해 출력해보면
        ""대충 이상하게 나옴""
        와 같은 식으로 다음 주소값이 출력된다는 것을 확인할 수 있다.
        즉, {1, 2, 3, 4, 5}로 출력되지 않는다.
        여기서, 우리는 일반 변수와 참조 변수 개념에 대해 학습해야한다.

        일반 변수: 데이터를 직접 가지는 변수
            byte, short, int, double 등 기본 데이터 타입(자료형, primitive type)을 가지는 경우
        참조 변수 : 데이터가 위치한 주소값을 가지는 변수로, 해당 주소를 통해 데이터에 접근해
            값을 가져오거나 변경하는 경우
            String, 배열, 객체(클래스), Collections(추후 수업 예정)


 */
public class ArrayTest01 {
    public static void main(String[] args) {

        //위 코드는 1부터 10까지를 저장하는 것만 단지 실행 할 뿐이나 너무
        // 번거롭다. 이를 해결하기 위한 배열의 선언 방식으로는,

//        int [] arr1 = new int[5];            // 배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입
//        int [] arr2 = {1, 2, 3, 4, 5};       // 배열 선언 방식 2 -> 배열 선언 및 초기화

//        //문자열 데이터를 변수에 저장하는 방버
//        String strExample1 = "안녕하세요";
//        //객체 생성 방식
//        String strExample2 = new String("안녕하세용");
//        System.out.println(strExample1);
//        System.out.println(strExample2);
//
//        if(strExample1 == "안녕하세요"){
//            System.out.println("실행1");
//        }
//
//        if(strExample2 == "안녕하세용"){
//            System.out.println("실행2");
//        }                                    // 문자열을 비교할 땐 "=="를 쓰지 않는다
//
//        if(strExample2.equals("안녕하세용")){
//            System.out.println("실행3");      // equals() 사용 하면 그 자체의 값과 비교
//        }
//
//        int [] arr03 = {10, 20, 30, 40};
//
//        System.out.println(arr03[0]);  //10
//        System.out.println(arr03[1]);  //20        //[]안에 있는 숫자를 인덱스(index)라고 하고 0부터 시작함
//        System.out.println(arr03[2]);  //30
//        System.out.println(arr03[3]);  //40        // 각 10 ~ 40 까지를 element 라고 한다. // 요소

        // 이상의 코드를 봣을 때 s out 코드가 반복되는 것 처럼 보임 -> 반복문 적용 가능

        int[] arr04 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //반복문을 사용해 각 요소를 출력하는 데 10 9 8 7 6 ... 1 로 출력할 수 있도록 하라
        // 1. 1에서 10가지 출력
        for(int num = 9; num >= 0; num -- ){
            System.out.print(arr04[num] + " ");
        }
        System.out.println();
        //2. 11에서 2까지 출력
        for(int num = 0; num < 10; num ++ ){
            System.out.print(arr04[num] + 1 + " ");
        }

        // 3. 위 과제들을 통해 알 수 있듯이 각 요소들은 그 자료형에 따라 수학적인 연산
        // 또는 기타 다른 작업을 실행할 수 있다


    }
}
