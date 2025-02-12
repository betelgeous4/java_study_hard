package chapter01_variable;

public class Variable01 {
    public static void main(String[] args) {
        System.out.println(3.1415929204);

        // 원주 구하는 공식: 지름 * pi
        // 7번 라인의 원주율을 이용해 지름이 19인 원의 둘레를 구하시오
        // sout 쳐서 콘솔창에 입력

            /*System.out.println(19*3.1415929204);
            자료명  변수명   데이터;       --> 변수 선언 및 초기화 방법
            double pi = 3.1415929204;   //초기화
            System.out.println(pi*23);*/


//            int age;    // 변수 선언
//            age = 21;   // 변수 초기화 -> 처음으로 변수에 데이터가 대입되는 것을 의미

        /*
            JAVA 에서의 변수 표기 방식 :
                카멜 표기법(Camel case) : 첫 문자는 소문자로 쓰고 복수의 단어가 연결된 경우에는
                                        두 번째 단어의 첫 문자만 대문자로 쓴다
                ex) 하나짜리 단어인 경우
                    String example;
                ex) 복수의 단어로 조합된 경우
                    String exampleOfKorean

//                1. 논리 자료형(boolean) 변수:  참 / 거짓 -> True / False
//                */
//            boolean checkFlag = false;       // 변수의 선언 및 초기화
//            System.out.println(checkFlag);
//            checkFlag = true;                // 이미 선언된 변수는 자료형을 적지 않는다
//            System.out.println(checkFlag);
//
////          checkFlag2 = true; -> 오류 발생 : 처음 나오는데 자료형을 적지 않아서
//
//            //변수의 선언 및 초기화
//
//            boolean checkFlag3 = true;
//            // 변수 선언 따로 초기화 따로
//            boolean checkFlag4; // 변수의 선언
//            checkFlag4 = false; // 초기화
//
//            /*
//                최초로 변수를 선언할 때 자료형(data type)을 명시하고 값을 대입하여 초기화한다.
//                추후에 해당 변수에 값을 재대입하는 경우 변수명 = (바뀐)값; 형태로 작성한다
//             */
//                //2. 문자 자료형 변수
//                char name1 = '박'; // 문자를 입력할 때는 작은 따옴표("'")로 감싼다
//                char name2 = '동'; // char은 character의 축약어로 알파벳/ 한글/ 숫자 하나를 의미함
//                char name3 = '준';
//              System.out.println(name1+name2+name3);
//            System.out.println(""+name1+name2+name3); // 박동준
//            /*
//                이상의 코드에서 확인할 수 있는 것은 컴퓨터는 생각보다 멍청해서 개발자들이 하나하나 전부 다 지정을 해줘야 한다는 점이다.
//                문자와 문자열은 서로 다른데 문자(하나짜리)를 세 번 더했을 경우 더 이상 문자가 아니람 문자 열로 되어야합니다.
//                컴퓨터는 융통성이 없어 57라인처럼 작성했을 경우 자료형 불일치로 결과값이 나오지 않았다.
//                그래서 문자들을 합쳐 문자열로 만들기 위해 꼼수를 쓴 것이 58번 라인과 같은 방식이다.
//                JAVA에선 sout의 경우 괗로 맨 앞 부분의 자료형을 따라가는 경우가 있다.
//                즉, 큰 따옴표로 시작했을 경우 ()내에 있는 부분을 전부 문자열로 보기 때문에 문자열 전체가 안정적으로 출력됨
//
//                지시 사항
//                name4, name5, name6에 한 글자씩 여러분의 이름을 대입하고, 콘솔창에 여러분 이름이 출력될 수 있도록 코드를 작성하세용
//             */
//            char name4 = '박';
//            char name5 = '동';
//            char name6 = '준';
//            System.out.println(""+name4+name5+name6);
//    }
//}
        //3. 정수 자료형 변수
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);
        /* int : Interger의 축약어로, 정수를 의미함
        실수에 해당하는 자료형 : double
        */

        /* 4. 실수 자료형 변수 */

        double pi = 3.1415929204;
// int pi2 = 3.1415929204;
// int LongNum = 1234567832132 오류
        long LongNum = 12345678912L; // Long 뒤에 충분히 긴 정수가 온다면 마지막에 L을 붙여줘야 함

//5. 문자열 자료형
/*
    String : 문자들이 일정한 순서를 지니고 나열된 것을 의미함. (대문자로 시작한다는 점)
 */
        String name = "박동준";
        int age = 21;
        System.out.println("제 이름은 " + name + "입니다.");
        System.out.println("제 나이는 " + (age + 1) + "입니다.");

//다음 수업 안내: 다중 라인에 걸친 스트링을 출력하는 법: 여러 줄에 걸친 스트링 출력




/*
    원래 JAVA17 이전까지는 스트링에 한 줄씩만 작성이 가능했음
 */
        String longsentence = "동해물과백두산이마르고닳도록하느님이보우하사우리나라만세무궁화삼천리화려강산" +
                "대한사람대한으로길이보전하세";

    /*
    근데 자바17부터 다중 스트링을 지원하게 되었다.
     */

        String introduction = """
                제 이름은 박동준입니다.
                방학 특강을 수강중입니다.
                열심히해보겠읍니다...
                """;
// 아마 큰따옴표 3개 붙이면 저렇게 되는 듯함
        System.out.println(introduction);

        /*
        다중 스트링의 경우 다음주 월요일 이후 이어감
         */

        /*
        int / long

            int (4 바이트, 32 비트)
                최소값: -2,147,483,648 (−2^31)
                최대값: 2,147,483,647 (2^31 − 1)
            long (8 바이트, 64 비트)
                최소값: -9,223,372,036,854,775,808 (−2^63)
                최대값: 9,223,372,036,854,775,807 (2^63 − 1)
         */

        /*
        5. 상수 -> 변수와 반대되는 개념
        특징
            1. 한 번의 선언 및 초기화가 가능, 변수와 달리 재대입이 불가능
            2. 이미 초기화가 끝난 상수를 한참 밑에서 불러올 경우
                걔가 상수인지 변수인지 가시적으로 확인이 불가능하기 때문에
                개발자들끼리의 약속으로 상수는 전부 다 대문자로 작성하고,
                단어와 단어 사이에 공백을 "_"로 연결함
            3. 상수를 선언할 때는 "final"키워드가 붙는다
         */

        // 자료형 변수명 = 데이터;
        //final 자료형 변수명 = 데이터;

        final int FINAL_NUM =  123;
        // FINAL_NUM = 321; <- 안됨

        System.out.println(FINAL_NUM);

        final String FILE_PATH = "C:\\DongJoonPark";
        System.out.println(FILE_PATH);



    }


}