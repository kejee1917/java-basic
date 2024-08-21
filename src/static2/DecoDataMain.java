package static2;

//import static
import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1.정적 호출");

        // 이렇게 이 클래스 안에서 여기저기 여러번 호출한다면?? 
        // => 상단에 import static 추가 : 클래스명 안써도 메소드 호출 가능
        staticCall();


        System.out.println("2.인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근 (권장하지 않음)
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        staticCall();

    }
}
