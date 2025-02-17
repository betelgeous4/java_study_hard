package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest09LottoWhile {
    public static void main(String[] args) {

        Random random = new Random();
        int totalGame = 5;
        int[] lottoNumbers = new int[6];
        boolean duplicate;
        int number;

        System.out.println("로또 게임 시작");
        while(totalGame > 0) {
            for (int i = 0; i < lottoNumbers.length; i++) {
                duplicate = false;
                number = random.nextInt(45) + 1;
                for (int k = 0; k < i; k++) {
                    if (lottoNumbers[k] == number) {
                        duplicate = true;
                    }
                }

                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
            totalGame --;
        }
    }
}
