package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    로또 번호 추첨기

    1. 1 - 45 까지의 숫자를 임의로 생성한 후, lotto Numbers 라는 배열에 저장
    2. 2차 배열을 만들 예정인데, 5번의 게임을 할 것. (로또 한 게임을 할 땐 한 번에 6개의 번호를 뽑는다)
    3. nextInt()를 통해 번호를 뽑게 되면 중복 번호가 생길 수 있다
        -> getter/setter 와 같은 파트에서 중복 제거에 관한 로직을 확인 가능
    4. 배열 완성 후 오름차순을 통해 숫자들을 정렬하여 출력

 */
public class ArrayTest08 {
    public static void main(String[] args) {
        //랜덤 클래스 임포트

        // 배열 생성
//       int[][] LottoNumbers = new int[5][6];
//        // random.nextInt(한계값) - 0~(한계값-1)까지의 int 값을 반환
//       int a = random.nextInt(46);
//        for(int i = 0; i < 5 ; i ++){
//            for(int j = 0; j < 6 ; j ++){
//                int num = random.nextInt(45);
//                LottoNumbers[i][j] = num + 1;
//            }
//            System.out.println(Arrays.deepToString(LottoNumbers));
//        }

//        int row = 0;
//
//            while (row > 6){
//                int num = random.nextInt(45);
//                for (int j = 0; j < row ; j++){
//                    while (num != lottoNumber[j]){
//                        lottoNumber[row] = num + 1;
//
//                    }
//                    row+=1;
//                }
//            System.out.println(Arrays.toString(lottoNumber));
//        }

//        for (int i = 0; i < lottoNumber.length;i++){
//            lottoNumber[i] = random.nextInt(45) + 1;
//        }

//        System.out.println(Arrays.toString(lottoNumber))
//        이상의 코드를 5번 반복하기 위해 이중 for 문 사용

        Random random = new Random();
        int totalGame = 5;
        int[] lottoNumbers = new int[6];
        boolean duplicate;
        // 배열에 집어넣기 전에 중복인지 확인할 수 있을만한 임시 변수 하나 선언
        int number;

        for (int j = 0; j < totalGame; j++) {                // 게임 전체 반복을 돌리는 반복문
            for (int i = 0; i < lottoNumbers.length; i++) {   // 난수를 생성해서 대입하는 반복문
                duplicate = false;                                                          // 여기서 초기화했습니다 -> 예를 들어 직전 반복에서 true가 떴다고 가정했을 때 계속해서 반복이 돌겠네요
                number = random.nextInt(45) + 1;            // 난수 대입
                // 여기서 반복을 돌릴건데                          // 완전히 확정 짓기 전에 중복을 체크
                for (int k = 0; k < i; k++) {
                    if (lottoNumbers[k] == number) {            // 배열에 있는 숫자가 방금 막 대입한
                        duplicate = true;                       // number와 겹치는 부분이 있다면 실행
                    }   // 위의 boolean 변수가 true가 되었다면 -> 다시 한 번 더 난수 대입을 해야 합니다.
                }

                if (!duplicate) {
                    lottoNumbers[i] = number;       // 중복이 없기 때문에 배열에 대입
                } else {
                    i--;                            // 반복 횟수를 한 번 까서 한 번 더 난수 대입이 되게끔
                }                                   // 작성함
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }



    }
}
