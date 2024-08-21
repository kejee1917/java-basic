package static1;

// static 을 사용해보기
public class Data3 {
    public String name; // 인스턴스변수
    public static int count; // static변수, 클래스변수, 정적변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
