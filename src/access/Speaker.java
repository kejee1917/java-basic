package access;

public class Speaker {

    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if(volume >= 100) {
            System.out.println("음량 증가 안됨");
        }else {
            volume += 10;
            System.out.println("음량 10 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 다운 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
