package class1;

public class ClassStart4 {

    // ***중요! 자바에서의 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
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


        // 배열
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;


        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

    }
}
