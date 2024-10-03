package poly.ex4;

//순수 추상 클래스 : 추상메서드로만 이루어짐
//부모타입으로서 껍데기만 제공함. 다형성을 위해서 사용함.
//=> 이게 바로 인터페이스!
public abstract class AbstractAnimal {
    //추상메서드 : 자식에서 반드시 오버라이딩!
    public abstract void sound();

    public abstract void move();
}
