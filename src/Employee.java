/**
 * Created by popoola on 2016/03/06.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String firstName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    /*public double raise(){
        double newSAl = (salary *0.1) + salary ;
    return newSAl;

    }*/
    public double yearlySal(){

        salary = (salary *0.1 + salary)  * 12 ;
        return salary;

    }
}
