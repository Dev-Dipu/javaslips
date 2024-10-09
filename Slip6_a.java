//Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
//information using toString().

class Employee {
    int empId;
    String empName;
    String empDesignation;
    double empSal;

    Employee(int empId, String empName, String empDesignation, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + "\n" +
                "Employee Name: " + empName + "\n" +
                "Designation: " + empDesignation + "\n" +
                "Salary: " + empSal;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", "Software Engineer", 75000);
        System.out.println(emp);
    }
}
