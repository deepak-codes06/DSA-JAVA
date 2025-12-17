package in.kgcoding.challange100;

public class ThreadState  extends Thread {


    @Override
    public void run(){
        try {
            Thread.sleep(4000);
            System.out.printf("from inside run %s\n",getState());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
