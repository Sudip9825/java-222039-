

public class counterScyn extends Thread {
    counter counter;
    
    public counterScyn(counter counter){
        this.counter = counter;

    }
    public void run(){
        for (int i=0;i<1000; i++){
            counter.increment();//incrementing count 1000l times
        }
    }
    
    public static void main(String[] args) {
        counter counter = new counter();
        counterScyn t1= new counterScyn(counter);
        counterScyn t2= new counterScyn(counter);     
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("final counter value:"+ counter.getCount());
    }
}
