package pack; // 첫줄에는 현존하는 패키지

import pack.a.User; // import

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data(); // 같은 위치
        User user = new User(); // import
    }
}
