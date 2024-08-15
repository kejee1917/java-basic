package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); // 같은 위치
        pack.a.User user = new pack.a.User(); // 다른 위치인 경우에 이렇게 씀.
        // => 근데 이렇게 쓰면 불편. import 를 쓰면 됨.
    }
}
