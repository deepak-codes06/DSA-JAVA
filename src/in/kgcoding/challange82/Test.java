package in.kgcoding.challange82;

public class Test {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[] { 1, 5,4,7});
        ArrayOperations.statistics Statistics = arr.new statistics();
        System.out.println(Statistics.mean());
    }
}
