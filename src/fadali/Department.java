package fadali;

public class Department {

    private int deptNo;
    private String deptName;
    // private ArrayList<Employee> emp;

    public Department() {
    }

    // Constructor with parameters
    public Department(int deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    // Getter for deptNo
    public int getDeptNo() {
        return deptNo;
    }

    // Setter for deptNo
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    // Getter for deptName
    public String getDeptName() {
        return deptName;
    }

    // Setter for deptName
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // // Getter for emp
    // public ArrayList<Employee> getEmp() {
    // return emp;
    // }

    // // Setter for emp
    // public void setEmp(ArrayList<Employee> emp) {
    // this.emp = emp;
    // }

    @Override
    public String toString() {
        return "Department Name = " + deptName + "Department No. = " + deptNo;
    }
}
