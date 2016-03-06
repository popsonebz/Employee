/**
 * Created by popoola on 2016/03/06.
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee("Femi", "Johnson",10000);
        Employee emp2 = new Employee("paul", "Johnson",5000);

        display(emp1);
        display(emp2);

        emp1.yearlySal();
        display(emp1);

        emp2.yearlySal();
        display(emp2);
    }
    public static void display(Employee emp){
        System.out.printf("%s %s monthly salary is %.2f before a raise%n", emp.getFirstName(), emp.getLastName(), emp.getSalary());
    }
}
