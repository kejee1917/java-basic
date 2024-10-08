package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        if(parent instanceof Child) { // 다운캐스팅하기에 안전한지 확인
            System.out.println("Child 인스턴스가 맞음.");
            Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스가 아님.");
        }
    }
}
