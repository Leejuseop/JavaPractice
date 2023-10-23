package book;

public interface Queue {
    void enQueue(String string);
    String deQueue();
    int getSize();
}
