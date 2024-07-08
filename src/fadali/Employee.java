package fadali;

public class Employee {
    private int Id;
    private float salary;
    private PersonalInformation personalInformation;
    private Department dept;

    public Employee() {
    }

    public Employee(int id, float salary, String FName, String MName, String LName, String BloodGroup,
            String AccountNumber, String Nationity, String YearOfBirth, Department dept) {
        Id = id;
        this.salary = salary;
        // this.personalInformation = personalInformation;
        personalInformation = new PersonalInformation(FName, MName, LName, BloodGroup,
                AccountNumber, Nationity, YearOfBirth);
        this.dept = dept;
    }

    // Getter for Id
    public int getId() {
        return Id;
    }

    // Setter for Id
    public void setId(int Id) {
        this.Id = Id;
    }

    // Getter for salary
    public float getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Getter for personalInformation
    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    // Setter for personalInformation
    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Department getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee [Id=" + Id + ", salary=" + salary + ", personalInformation=" + personalInformation + ", dept="
                + dept + "]";
    }

}
