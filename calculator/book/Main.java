package book;

public class Main {
    public static void main(String[] args){
        Queue selfQueue = new BookShelf();

        selfQueue.enQueue("책1");
        selfQueue.enQueue("책2");
        selfQueue.enQueue("책3");

        System.out.println(selfQueue.deQueue());
        System.out.println(selfQueue.deQueue());
        System.out.println(selfQueue.deQueue());
    }
}
