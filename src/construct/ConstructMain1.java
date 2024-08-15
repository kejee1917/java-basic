package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] memberInits = {member1, member2};

        for (MemberConstruct s : memberInits) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);

        }
    }
}
