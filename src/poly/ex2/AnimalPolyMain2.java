package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        Animal cow = new Cow();
        
        //배열
        Animal[] animalArr = {dog, cat, cow}; // new Animal[]{dog, cat, cow};

        //반복문
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound(); //메서드 오버라이딩이 무조건 우선!
            System.out.println("동물 소리 테스트 종료");
        }
    }

}
