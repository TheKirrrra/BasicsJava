package homeworks.homework1_23.homework_20;

public class info {
    public static void main(String[] args) {


    Employee emp = new Employee(null, 20, 1500);

       emp.setName("Kira");
       emp.setAge(77);
       emp.setSalary(100);

       emp.setName("");
       emp.setAge(10);
       emp.setSalary(4500);


        System.out.println(emp.info());


}
}
