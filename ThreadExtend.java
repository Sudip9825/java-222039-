public class ThreadExtend extends Thread {
    public void run(){
      for (int i=1; i<=5;i++){
        System.out.println(Thread.currentThread().getId() + "value:" +i);
      }
    }
    
    public static void main(String[] args) {
      ThreadExtend t1= new ThreadExtend();
      ThreadExtend t2= new ThreadExtend();
  
      t1.start(); //starting the frist thread
      t2.start(); // starting the second thread
    }
  }