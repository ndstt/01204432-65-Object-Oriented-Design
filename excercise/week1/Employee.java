package excercise.week1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12 * this.salary;
    }

    public int raiseSalary(int percent) {
        double a = this.salary * percent / 100;
        this.salary += a;
        return this.salary;
    }

    public String toString() {
        return "Employee[id=" + this.id + 
                        ",name=" + this.getName() + 
                        ",salary=" + this.salary + "]";
    }
}
