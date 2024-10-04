package poly.car0;

//이렇게 코드를 짜면 생기는 문제 -> 차가 추가되면 Driver 클래스내에서도 변경을 해야함.
public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car; //추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전한다");
        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        }else if(model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
