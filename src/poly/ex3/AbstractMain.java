package poly.ex3;

import poly.ex2.Animal;
import poly.ex3.Cat;
import poly.ex3.Cow;
import poly.ex3.Dog;

public class AbstractMain {

    public static void main(String[] args) {
        //추상 클래스 생성 불가 new xxx
        //AbstractAnimal abstractAnimal = new AbstractAnimal();
        poly.ex3.Dog dog = new poly.ex3.Dog();
        poly.ex3.Cat cat = new poly.ex3.Cat();
        poly.ex3.Cow cow = new poly.ex3.Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
