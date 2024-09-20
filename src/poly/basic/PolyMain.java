package poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); // 부모 메서드 호출
        child.childMethod(); // 자신의 메서드 호출

        //부모 변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //자식은 부모를 담을 수 없다.
        //Child child1 = new Parent();
        
        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod(); poly변수의 타입이 Parent인데 Parent에는 Child정보를 가지고 있지 않음.ㄴ

    }
}
