package in.kgcoding.challange85;

public class Car extends Vehicle {
    @Override
    void service(){
        super.service();
        System.out.println("your car's service was done: ");
    }
}
