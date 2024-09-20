package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        //super(); 부모가 기본생성자가 없기때문에 부모의 생성자 직접 정의해야함.
        super(10, 20);
        System.out.println("ClassC 생성자");
    }

}
