package chapter08_classes.score_calc;

import java.util.Scanner;

import static chapter08_classes.score_calc.ScoreCalc.calculateAvg;

public class ScoreCalcMain {
    public static void main(String[] args) {
        ScoreCalc scoreCalc = new ScoreCalc();
        Scanner scanner = new Scanner(System.in);
//        double totalScore = 0;   //이 파일 안에서 쓸 변수는 여기서 정의해야 함
//        System.out.println(ScoreCalc.addScores(100, 100));
//        System.out.println(ScoreCalc.calculateAvg(totalScore, 2));

        /*
            chapter07에 있는 ScoreCalc 와 동일하게 기능하도록 작성
         */
        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        double avgScore = 0;
        int totalSubs = 1;

        while(!endOfCalc){
            System.out.println("점수를 입력하세요 (종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if (score1 == -1) {
                break;
            }

            totalScore = ScoreCalc.addScores(totalScore, score1);
            avgScore = calculateAvg(totalScore, totalSubs);

            System.out.println("점수 입력시 나오는 합계와 평균");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);
        }
        System.out.println("최종 합계와 평균");
        System.out.println("최종 점수의 합계 : " + totalScore);
        System.out.println("최종 점수의 평균 : " + avgScore);






    }
}
