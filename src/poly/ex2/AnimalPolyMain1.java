package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal) { //animal 변수가 자식의 인스턴스 참조! = 다형적 참조
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //메서드 오버라이딩이 무조건 우선!
        System.out.println("동물 소리 테스트 종료");
    }
}
