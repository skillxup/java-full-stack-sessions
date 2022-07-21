class EmployeeCount {
    private int numOfEmployees = 0;

    public void setNoOfEmployees(int count) {
        numOfEmployees = count;
    }

    public double getNoOfEmployees() {
        return numOfEmployees;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        EmployeeCount obj = new EmployeeCount();
        obj.setNoOfEmployees(4672);
        System.out.println("No of Employees: " + (int)obj.getNoOfEmployees());
    }
}