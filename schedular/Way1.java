package schedular;

public class Way1 implements Schedular{
    
    public void getNextCall(){
        System.out.println("전화를 받았습니다.");
    }

    public void sendCallToAgent(){
        System.out.println("첫번째 방법으로 전화를 넘겼습니다.");
    }

}
