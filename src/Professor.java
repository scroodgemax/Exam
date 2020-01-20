public class Professor {
    private String name;
    private String surname;
    private String department;

    public Professor(String name, String surname, String department)
    {
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
