package class1;

public class ClassStart3 {

    public static void main(String[] args) {

        Student student1;
        student1 = new Student(); // 실체 = 객체, 인스턴스
        student1.name = "학생1"; // .을 통해서 접근한다.
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 실체 = 객체, 인스턴스
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);

        // new 는 객체 생성

        // 참조값을 확인 하는 방법
        System.out.println(student1); // class1.Student@~~~~
        System.out.println(student2);
    }
}
