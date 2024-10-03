package poly.ex3;

//추상 클래스 : 추상메서드가 하나라도 있으면 추상 클래스로 선언해야 함.
public abstract class AbstractAnimal {
    public abstract void sound(); //추상메서드 : 자식에서 반드시 오버라이딩!

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
