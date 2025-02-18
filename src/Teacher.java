public class Teacher extends People {

    private String name;
    private double salary;



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Teacher(String name) {
        super(name);
    }
}
