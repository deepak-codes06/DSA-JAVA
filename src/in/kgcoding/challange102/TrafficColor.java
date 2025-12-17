package in.kgcoding.challange102;

public enum TrafficColor {
    RED(5000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMills;

    public int getOnTimeInMills() {
        return onTimeInMills;
    }

    TrafficColor(int onTimeInMills){
        this.onTimeInMills = onTimeInMills;
    }
}
