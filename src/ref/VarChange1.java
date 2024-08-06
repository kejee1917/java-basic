package ref;

import class1.Student;

public class VarChange1 {

    // ***중요! 자바에서의 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
    public static void main(String[] args) {

        int a = 10;
        int b = a;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        //a 변경
        a = 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        //b 변경
        b = 30;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
