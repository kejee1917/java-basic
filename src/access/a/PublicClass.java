package access.a;

// 클래스는 public default 접근 제어자 가능
// 한 클래스에서 public class는 하나만 가능 (왜냐면, public은 파일명과 class명이 동일해야 하기에)
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
