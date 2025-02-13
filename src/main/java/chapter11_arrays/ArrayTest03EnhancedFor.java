package chapter11_arrays;
/*
    향상된 for 문(Enhanced for loop)

        일반 for 문과의 차이점 :
            일반 for 문의 경우 인덱스 넘버를 명확히 알고있어야 하지만 일일이 요소의 숫자를 세는 것이
            번거롭기 때문에 arr01.length 와 같은 방식으로 int 를 추출해서 대입했었다. 그런데
            잘 생각해보면 for (int i ... ) 할 때의 int i는 for 문 내부에서 선언된다.
            이를 응용해 배열 내의 요소를 변수에 대입해버리는 방식으로 인덱스 넘버의 사용 없이
            적용할 수 있는 for 반복문에 해당한다.

        제약 : 읽기만 되고, 쓰기가 안 됨

        형식 :
            for (자료형 변수명 : 반복 가능 객체(배열) ){
                실행문
                }
 */
public class ArrayTest03EnhancedFor {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5,6,7,8,9,10};

        //일반 for 문
        for(int i = 0; i < arr01.length ; i++){
            System.out.println(arr01[i] + " ");
        }

        // 향상된 for 문
        for(int j : arr01) {
            System.out.println(arr01[j] + " ");

        }

        // 이상을 이유로 배열의 경우 복수형 변수를 사용한다.
        String[] names = {"김일","김이","김삼","김사","김오","김육","김칠"};

        for( String name : names ) {
            System.out.println(name);
        }



    }
}
