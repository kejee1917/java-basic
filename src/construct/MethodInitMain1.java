package construct;

import ref.Student;

public class MethodInitMain1 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit(); //x001
        member1.name = "학생1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit(); //x002
        member2.name = "학생2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit s : memberInits) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);

        }
    }

}
