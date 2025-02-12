package chapter09_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {

        UnivStudent student01 = new UnivStudent();
        student01.name = "김일";
        student01.grade = 1;
        student01.score = 3.3;

        UnivStudent student02 = new UnivStudent("김이");
        student02.grade = 2;
        student02.score = 4.0;

        UnivStudent student03 = new UnivStudent(3);
        student03.name = "김삼";
        student03.score = 2.7;

        UnivStudent student04 = new UnivStudent("김사", 4);
        student04.score = 3.8;

        UnivStudent student05 = new UnivStudent("김오", 1, 1.0);


        student01.setName("김일");
        student01.setGrade(1);
        student01.setScore(3.3);


        student01.getInfo();
        student02.getInfo();
        student03.getInfo();
        student04.getInfo();
        student05.getInfo();




    }
}
