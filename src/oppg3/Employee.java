package oppg3;

public class Employee {

    private String firstname;
    private String lastname;
    private String position;
    private int salary;
    private Gender gender;

    public Employee(String firstname, String lastname, String position, int salary, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.salary = salary;
        this.gender = gender;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{" +
                " firstname='" + getFirstname() + "'" +
                ", lastname='" + getLastname() + "'" +
                ", position='" + getPosition() + "'" +
                ", salary='" + getSalary() + "'" +
                ", gender='" + getGender() + "'" +
                "}";
    }
}
