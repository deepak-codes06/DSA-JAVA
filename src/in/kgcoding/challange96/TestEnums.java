package in.kgcoding.challange96;

public class TestEnums {
    public static void main(String[] args){
        for (Days day : Days.values()) {
            System.out.printf("%s : %S \n" ,day ,  day.getType() );
        }

    }
}
