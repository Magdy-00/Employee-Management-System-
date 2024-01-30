/*
Hourly-employee earning depends on how many hours he/she worked on that 
month (there is a wage per hour for him/her). This class should define the fields 
wage and hours. His/her earning method should return the multiplication of wage 
and hours.
*/
public class Hourly extends PaidEmployee {
    private String name;
    private String address; 
    private int SSN;
    private double hours_worked;
    private double wage_in_hour;
    public void delEmp(String empname){
        if(empname.equals(name)){
            name=null;
        }
    }
    public void addHoEmployee(){//for paid
        setName(name);
        setAddress(address);
        setSSN(SSN);
        setAddress(address);
        setWage_in_hour(wage_in_hour);
        setHours_worked(hours_worked);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

    public void setWage_in_hour(double wage_in_hour) {
        this.wage_in_hour = wage_in_hour;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSSN() {
        return SSN;
    }

    public double getSalary(){
        return hours_worked*wage_in_hour;
    }

    @Override
    public String toString() {
        return "Hourly{" + "name=" + name + ", address=" + address + ", SSN=" + SSN + ", hours_worked=" + hours_worked + ", wage_in_hour=" + wage_in_hour + ",salay is = " +(hours_worked * wage_in_hour) +'}';
    }
    
}
