/*
A monthly-employee has a monthly salary. This class should define the field salary. 
His earning method should return this salary
*/
public class Monthly extends PaidEmployee {
    private String name;
    private String address;
    private double salary; 
    private int SSN;
    public void delEmp(String empname){
        if(empname.equals(name)){
            name=null;
        }
    }
    public void addMonEmployee(){//for paid
        setName(name);
        setAddress(address);
        setSSN(SSN);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public int getSSN() {
        return SSN;
    }

    @Override
    public String toString() {
        return "Monthly{" + "name=" + name + ", address=" + address + ", salary=" + salary + ", SSN=" + SSN + '}';
    }
    
}
