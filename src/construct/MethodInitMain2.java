package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit(); //x001
        memberInit(member1, "학생1", 15, 90);

        MemberInit member2 = new MemberInit(); //x002
        memberInit(member2, "학생2", 16, 80);

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit s : memberInits) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);

        }
    }

    static void memberInit(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }


}
