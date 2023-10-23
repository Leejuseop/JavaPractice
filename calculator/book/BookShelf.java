package book;

public class BookShelf extends Shelf implements Queue{
    
    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public int getSize(){
        return getCount();
    }
}
