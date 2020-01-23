public class Professor extends Person{

    private String department;

    public Professor(String name, String surname, String department)
    {
        super(name, surname);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
