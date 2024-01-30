/*
An executive has a monthly salary 
and a bonus for that month. So this class has to define a salary and bonus fields. 
His earning method should return the summation of his salary and the bonus
*/
public class Executive extends PaidEmployee {
    private String name;
    private String address;
    private double salary; 
    private double bouns;
    private int SSN;
    public void delEmp(String empname){
        if(empname.equals(name)){
            name=null;
        }
    }
    public void addExeEmployee(){//for paid
        setName(name);
        setSalary(salary);
        setSSN(SSN);
        setAddress(address);
        setBouns(bouns);
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getSSN() {
        return SSN;
    }
    

    public void setBouns(double bouns) {
        this.bouns = bouns;
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

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary + bouns;
    }

    @Override
    public String toString() {
        return "Executive{" + "name=" + name + ", address=" + address + ", salary=" + (salary+bouns) + ", SSN=" + SSN + '}';
    }

    
    }
    

