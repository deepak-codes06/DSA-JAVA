package in.kgcoding.challange79;

public class Test {
    public static void main(String[] args){
        Employee emp = new Employee("Deepak kumar",21,30000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("manish");
        emp.setAge(23);
        emp.setSalary(250000);
        System.out.println(emp.getEmployeeDetails());
        System.out.println(emp.getSalary());
    }
}
