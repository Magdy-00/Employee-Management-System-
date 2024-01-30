/*
. A volunteer is not paid so his earning method should return 0

*/
public class Volunteer extends Employee {
    private String name;
    private String address;
    public void delEmp(String empname){
        if(empname.equals(name)){
            name=null;
        }
        
    }
    public void addVoEmployee(){//for vo
        setName(name);
        setAddress(address);
    }

    public void setName(String name) {//this method loops form 0 to the size that the user will enter in the main method
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Volunteer{" + "name=" + name + ", address=" + address + '}';
    }
    
}
