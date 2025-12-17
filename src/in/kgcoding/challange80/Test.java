package in.kgcoding.challange80;

public class Test {
    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.checkOut();
        dvd.returnItem();
        dvd.duration = 54;
        System.out.println(dvd.duration);
    }
}
