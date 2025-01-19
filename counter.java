// lab 4
public class counter {
    private int count =0;
    //synchronized method to ensure thread safety
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
