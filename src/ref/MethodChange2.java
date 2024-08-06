package ref;

public class MethodChange2 {

    // ***중요! 자바에서의 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); //10

        change(dataA);

        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value); //20

        // 엇 기본형일때는 값이 안바뀌었는데 참조형일때는 바뀌었다.
    }

    static void change(Data dataX) {
        dataX.value = 20;
    }
}
