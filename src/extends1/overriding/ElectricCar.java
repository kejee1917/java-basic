package extends1.overriding;

public class ElectricCar extends Car {

    // 메서드 오버라이딩(재정의)
    // [조건] 메서드 이름이 같아야 함.
    // 1.파라미터 타입, 개수, 순서 같아야 함.
    // 2.반환 타입이 같아야 함
    // 3.접근제어자는 상위 클래스보다 더 제한적이면 안됨
    // 4.생성자는 오버라이딩 할 수 없음.
    // 5.private, static, final 키워드 붙은 메소드는 불가
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
