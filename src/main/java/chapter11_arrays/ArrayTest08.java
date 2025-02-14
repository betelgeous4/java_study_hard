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
        Random random = new Random();
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
        int [] lottoNumber = new int [6];
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

        for (int i = 0; i < 5 ; i++){
            for (int j = 0; j < lottoNumber.length;j++){
                lottoNumber[j] = random.nextInt(45) + 1;
                for(int k = 0; k < j ; k ++) {
                    if (lottoNumber[j]!=lottoNumber[k]){

                    }
                }
            }
            Arrays.sort(lottoNumber);
            System.out.println(Arrays.toString(lottoNumber));
        }


    }

}
