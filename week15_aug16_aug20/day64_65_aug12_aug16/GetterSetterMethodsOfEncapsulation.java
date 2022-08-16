// Getter and Setter Methods in Encapsulation
class EncapsulationGS {
    private int ssn;
    private String empName;
    private int empAge;

    // getter and setter methods
    public void setEmpName(String newValue) {
        empName = newValue;
    }

    public void setEmpAge(int newValue) {
        empAge = newValue;
    }

    public void setEmpSSN(int newValue) {
        ssn = newValue;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public int getEmpSSN() {
        return ssn;
    }
}

public class GetterSetterMethodsOfEncapsulation {
    public static void main(String[] args) {
        EncapsulationGS obj = new EncapsulationGS();
        obj.setEmpName("john");
        obj.setEmpAge(23);
        obj.setEmpSSN(543432);

        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
