package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NPE 발생! 프로그램 종료!
        System.out.println("data = " + data.value); //이 로직은 수행 안됨.

    }
}
