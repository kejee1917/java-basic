package poly.ex2;

//AnimalPolyMain2 Class를 좀 더 개선!
public class AnimalPolyMain3 {

    public static void main(String[] args) {
        //배열
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()}; // new Animal[]{dog, cat, cow};

        //반복문
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //메서드로 뽑기 단축키 : ctrl alt M
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //메서드 오버라이딩이 무조건 우선!
        System.out.println("동물 소리 테스트 종료");
    }

}
