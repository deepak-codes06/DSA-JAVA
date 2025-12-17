package in.kgcoding.challange102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW );
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();

    }
}
