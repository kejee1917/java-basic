package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // 초기화
        System.out.println("data = " + bigData.count); //0
        System.out.println("data = " + bigData.data); //null

        System.out.println("data = " + bigData.data.value); // NPE 발생! 프로그램 종료!

    }
}
