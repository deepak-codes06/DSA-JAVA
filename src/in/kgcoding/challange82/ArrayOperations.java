package in.kgcoding.challange82;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers){
        this.numbers = numbers;
    }

    public class statistics{
        double mean(){
            double sum = 0;
            for(int number : numbers){
                sum += number;
            }
            return sum / numbers.length;
        }
    }
}
