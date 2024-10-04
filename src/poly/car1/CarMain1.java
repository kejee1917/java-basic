package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car); //부모는 자식을 담을 수 있다!
        driver.drive();

        //차량 변경(model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //차량 추가(newCar)
        //Driver의 코드를 손대지 않고, 새로운 차량을 추가!
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
