package construct;

public class MethodInitMain3 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.memberInit("학생1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.memberInit("학생2", 16, 80);

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit s : memberInits) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);

        }
    }

}
