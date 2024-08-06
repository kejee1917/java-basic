package ref;

public class MethodChange1 {

    // ***중요! 자바에서의 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
    public static void main(String[] args) {

        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);

        change(a);

        //메소드가 종료되면 매개변수 X는 제거
        System.out.println("메서드 호출 후 : a = " + a);
    }

    static void change(int x) {
        x = 20;
    }
}
