package in.kgcoding.challange81;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Deepak",21);
        Person per = new Person("Deepak",21);
        if(p.equals(per)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(p.hashCode() == per.hashCode()){
            System.out.println("hash codes are equal " + p);
        }else {
            System.out.printf("Hash codes were different %d and %d%n " , p.hashCode() , per.hashCode());
        }
    }
}
