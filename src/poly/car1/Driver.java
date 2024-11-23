package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정 : " + car);
        System.out.println("~9~~~9~");
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
