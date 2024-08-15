package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 (오버로딩)
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 자기자신의 생성자 호출, this()는 생성자 안에서만 사용 가능, 첫번째 줄에서만 사용
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    // class 이름과 같음, 반환 타입이 없음
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
