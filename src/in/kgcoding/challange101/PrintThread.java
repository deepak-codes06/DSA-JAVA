package in.kgcoding.challange101;

public class PrintThread extends Thread {

    private final int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        System.out.printf("%d start thread %s\n ",threadNumber,Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%d end thread %s\n",threadNumber,Thread.currentThread().getName());
    }


}
