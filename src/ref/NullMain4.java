package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // 초기화

        System.out.println("data = " + bigData.count); //0
        System.out.println("data = " + bigData.data); //null

        //NPE 해결
        bigData.data = new Data();
        System.out.println("data = " + bigData.data.value); // 0 NPE 발생 안함!

    }
}
