package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출X
        //poly.childMethod();

        //일시적 다운캐스팅 -> 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); // 연산자의 우선순위를 바꾸기 위해 괄호 사용
    }
}
