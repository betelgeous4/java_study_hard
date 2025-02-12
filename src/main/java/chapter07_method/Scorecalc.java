package chapter07_method;

/*
    점수들을 입력받아 총합 및 평균 점수를 내는 프로그램을 구현할 예정
    여태까지는 main 단계에서 전체를 작성해왔으나, 이제부턴 method 부분과
    실행 부분(main 메서드가 적용된 부분)을 나누는 과정을 거칠 예정이다.
 */
public class Scorecalc {


//    //1. 총 합을 내는 메서드 : call4 유형으로 작성하겠습니다
//    public static double addScores (double score1, double score2){
//        return score1 + score2;
//
//    }
//    //2. addScores() 메서드를 오버로딩하여 매개변수가 3, 4, 5, 6인 메서드들을 만드세요
//    //3
//    public static double addScores (double score1, double score2,
//                                    double score3){
//        return score1 + score2 + score3;
//    }
//    //4
//    public static double addScores (double score1, double score2,
//                                    double score3, double score4){
//
//        return score1 + score2 + score3 + score4;
//    }
//    // 5
//    public static double addScores (double score1, double score2,
//                                    double score3, double score4,
//                                    double score5){
//
//        return score1 + score2 + score3 + score4 + score5; }
//    //6
//    public static double addScores (double score1, double score2,
//                                    double score3, double score4,
//                                    double score5, double score6){
//
//        return score1 + score2 + score3 + score4 + score5 + score6; }


    public static void main(String[] args) {
        //scanner class import
//        Scanner scanner = new Scanner(System.in);
//        //사용할 변수 목록
//        double score1 = 0;
//        double score2 = 0;
//        double totalScore = 0;
//        int totalSubjects = 0;
//        double averageScore = 0;
//
//        System.out.println("과목 1의 점수를 입력하세요 >>> ");
//        score1 = scanner.nextDouble();
//        System.out.println("과목 2의 점수를 입력하세요 >>> ");
//        score2 = scanner.nextDouble();
//        totalScore = score1 + score2;
//        totalSubjects = 2;
//        averageScore = totalScore / totalSubjects;
//        System.out.println("당신의 총점은 : " + totalScore);
//        System.out.println("점수의 평균은 : " + averageScore);

//        System.out.println(addScores(100,78));
//        System.out.println(addScores(100,45,56));
//        System.out.println(addScores(100,90,50,80));
//        System.out.println(addScores(100,90,90,90,90));
//        System.out.println(addScores(100,90,80,100,100,50));


//        //여태까지 했던 사례
//        double totalScore2 = addScores(100,90);
//        int subs = 2;
//        double avgScore = calculateAvg(totalScore2, subs);
//        System.out.println(avgScore);
//
//        //가독성은 깨질 순 있으나 개발자들이 사용하는 방식
//        System.out.println(calculateAvg(addScores(100,50), 2));


        //상의 코드는 오버로딩이 항상 만능은 아니라는 점이고, 기존에 있는 메서드를
        // main 단계에서 어떻게 잘 활용하며 무분별하게 오버로딩을 하지 않아도 되는지 보이기 위함이다.

//        public class ScoreCalc {
//            // 1. 총합을 내는 메서드 : call4() 유형으로 작성하겠습니다. 매개변수 / return 존재
//            public static double addScores(double totalScore, double addedScore) {
//                return totalScore + addedScore;
//            }
//
//            public static double calculateAvg(double totalScore, int numOfSubjects) {
//                return totalScore / numOfSubjects;
//            }
//
//
//            Scanner scanner = new Scanner(System.in);
//
//            boolean endOfCalc = false;
//            double score1 = 0;
//            double totalScore = 0;
//            double avgScore = 0;
//            int totalSubs = 1; //과목 수
//
//        while(!endOfCalc)
//            {
//                System.out.println("점수를 입력하세요 (종료하려면 -1을 입력하세요) >>> ");
//                score1 = scanner.nextDouble();
//                if (score1 == -1) {
//                    break;
//                }
//                //합을 계산하기 위한 코드
//                totalScore = addScores(totalScore, score1);
//
//                avgScore = calculateAvg(totalScore, totalSubs);
//                System.out.println("점수 입력시 나오는 합계와 평균");
//                System.out.println("입력한 점수의 합계 : " + totalScore);
//                System.out.println("입력한 점수의 평균 : " + avgScore);
//
//            }
//
//
//        }
    }
}