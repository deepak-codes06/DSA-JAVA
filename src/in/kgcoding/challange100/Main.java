package in.kgcoding.challange100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();

        System.out.printf("created the thread %s\n",t1.getState());
        t1.start();
        t1.join();

        System.out.printf("thread finished %s\n",t1.getState());

    }
}
