package chapter09_setter_getter.univ_student;
/*
    1. 클래스 설계
        field 종류 : name / grade / score(score 은 double) -> 그리고 전부 private

    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 받는 생성자
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자

    3. Setter / Getter 메서드 정의
        각각의 필드에 대한 Setter / Getter 만듭니다. Setter 3개 / Getter 3개
        1) setGrade 의 범위 1 ~ 4 학년
        2) setScore 의 범위 0.0 ~ 4.5

    4. UnivStudentMain.java 를 생성하시고
        student01 -> 기본 생성자 이용 김일 / 1 / 3.3
        student02 -> 이름만 받는 생성자 김이 / 2 / 4.0
        student03 -> 학년만 받는 생성자 김삼 / 3 / 2.7
        student04 -> 이름과 학년을 받는 생성자 김사 / 4 / 3.8
        student05 -> 이름 학년 점수를 받는 생성자 김오 / 1 / 1.0

    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
    으로 출력될 수 있도록 showInfo() 메서드를 call1()유형으로 작성하여 UnivStudent.java 에 추가
    UnivStudentMain.java 에서
    student01.showInfo(); 로 호출할 수 있도록 하시오.
 */
public class UnivStudent {

    String name;
    int grade;
    double score;
    // 기본생성자
    public UnivStudent() {
    }
    // 이름만 받는 생성자
    public UnivStudent(String name) {
        this.name = name;
    }
    // 학년만 받는 생성자
    public UnivStudent(int grade) {
        this.grade = grade;
    }
    // 이름과 학년 받는 생성자
    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    // 이름 학년 점수 받는 생성자
    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    // setter grade
    public void setGrade(int grade) {
        if (grade > 4 || grade < 1) {
            System.out.println("학년이 아닙니다.");
            return;             // 메서드에 return;으로 작성하면 메서드 자체 종료
        }
        System.out.println("학년을 수정합니다.");
        System.out.println("변경 전 학년 : " + this.grade);
        this.grade = grade;       // 여기서 argument로 받은 매개변수를 필드에 대입
        System.out.println("변경 후 학년 : " + this.grade);
    }
    //getter grade
    public int getGrade() {
        return grade;
    }

    // setter score
    public double setScore(double score) {
        if (score > 4.5 || score < 0.0) {
            System.out.println("점수가 아닙니다.");
        }
        System.out.println("점수를 수정합니다.");
        System.out.println("변경 전 점수 : " + this.score);
        this.score = score;
        System.out.println("변경 후 점수 : " + this.score);
        return score;
    }
    // getter score

    public double getScore() {
        return score;
    }

    // setter name

    public void setName(String name) {
        if(name.length() < 2 || name.length() > 4) {
            System.out.println("다시 이름을 입력해 주십시오");
        }
        System.out.println("이름을 수정합니다.");
        System.out.println("수정 전 이름 : " + this.name);
        this.name = name;
        System.out.println("수정 후 이름 : " + this.name);

    }

    // getter name

    public String getName() {
        return name;
    }

    public void getInfo() {

        System.out.println("학년 : " + this.grade);
        System.out.println("이름 : " + this.name);
        System.out.println("점수 : " + this.score);
        System.out.println();


    }
}