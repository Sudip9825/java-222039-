public class labfour_threads extends Thread {
    public void run(){
        for(int i=1;i<5; i++){
            System.out.println(Thread.currentThread().getId() + "value:"+i);
        }
    }
    public static void main(String[] args) {
     labfour_threads myRunnable =new labfour_threads();
     labfour_threads t1 = new labfour_threads();
     labfour_threads t2=new labfour_threads();
     t1.start();//starting the first thread
     t2.start();//starting the second thread
    }
    
    
}
