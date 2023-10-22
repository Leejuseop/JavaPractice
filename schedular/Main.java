package schedular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        int key;

        Schedular schedular = null;
        Scanner s = new Scanner(System.in);

        System.out.println("전화 배분방식을 입력하세요 : 1, 2, 3");

        key = s.nextInt();

        if(key == 1){
            schedular = new Way1();
        }
        else if(key == 2){
            schedular = new Way2();
        }
        else if(key ==3){
            schedular = new Way3();
        }
        else{
            System.out.println("Invalid Insert");
            return;
        }

        schedular.getNextCall();
        schedular.sendCallToAgent();

        
    }
    
}
