package ref;

public class VarChange2 {

    // ***중요! 자바에서의 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 참조값만 복사! x001

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value=" + dataA.value);
        System.out.println("dataB.value=" + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("dataA.value=" + dataA.value);
        System.out.println("dataB.value=" + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("dataA.value=" + dataA.value);
        System.out.println("dataB.value=" + dataB.value);
    }
}
