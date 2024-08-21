package static2;

public class DecoData {
    
    private int instanceValue;
    private static int staticValue;
    
    public static void staticCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
        
        //instanceValue++; // 인스턴스 변수 접근, 컴파일 에러
        //instanceMethod(); // 인스턴스 메서드 접근, 컴파일 에러
        //결론: static은 static 만 접근 가능
    }

    // 객체의 참조값을 직접 매개변수로 전달하면 static 메서드도 인스턴스 사용 가능
    // 참조값(위치)를 알기 때문에 접근 가능한 것.
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근
    }
    
    private void instanceMethod() {
        System.out.println("instanceMethod = " + instanceValue);
    }
    
    private static void staticMethod() {
        System.out.println("staticMethod = " + staticValue);
    }
}
