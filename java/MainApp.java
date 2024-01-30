import java.util.Scanner;

public class MainApp {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Volunteer v = new Volunteer();
        Executive e = new Executive();
        Monthly m = new Monthly();
        Hourly h = new Hourly();
        System.out.print("Enter the size you want for the array: ");
        int size = in.nextInt();
        in.nextLine();  // Consume the newline character

        Employee[] employees = new Employee[size];

        System.out.println("Menu: \n1. Enter a new employee\n2. Delete an employee\n3. Print the paychecks\n4. quit");

        String choice;
        do {
            System.out.print("Enter your choice: ");
            choice = in.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    System.out.println("Enter the category of the employee");
                    String category = in.nextLine();
                    //the category is executive
                    if ("executive".equalsIgnoreCase(category)) {
                        
                        System.out.println("Enter the name of the employee: ");
                        e.setName(in.nextLine());
                        System.out.println("Enter the address of the employee: ");
                        e.setAddress(in.nextLine());
                        System.out.println("Enter the SSN of the employee: ");
                        e.setSSN(Integer.parseInt(in.nextLine()));
                        System.out.println("Enter the salary of the employee: ");
                        e.setSalary(Double.parseDouble(in.nextLine()));
                        System.out.println("Enter the bonus of the employee: ");
                        e.setBouns(Double.parseDouble(in.nextLine()));
                        System.out.println(e.toString());

                        // Add the executive to the array
                        for (int i = 0; i < employees.length; i++) {
                            if (employees[i] == null) {
                                employees[i] = e;
                                break;
                            }
                        }
                    }
                    //the category is monthly
                    else if ("monthly".equalsIgnoreCase(category)) {
                        
                        System.out.println("Enter the name of the employee: ");
                        m.setName(in.nextLine());
                        System.out.println("Enter the address of the employee: ");
                        m.setAddress(in.nextLine());
                        System.out.println("Enter the SSN of the employee: ");
                        m.setSSN(Integer.parseInt(in.nextLine()));
                        System.out.println("Enter the salary of the employee: ");
                        m.setSalary(Double.parseDouble(in.nextLine()));
                        System.out.println(m.toString());

                        // Add the monthly to the array
                        for (int i = 0; i < employees.length; i++) {
                            if (employees[i] == null) {
                                employees[i] = m;
                                break;
                            }
                        }
                    }
                    //the category is hourly
                    else if ("hourly".equalsIgnoreCase(category)) {
                        
                        System.out.println("Enter the name of the employee: ");
                        h.setName(in.nextLine());
                        System.out.println("Enter the address of the employee: ");
                        h.setAddress(in.nextLine());
                        System.out.println("Enter the SSN of the employee: ");
                        h.setSSN(Integer.parseInt(in.nextLine()));
                        System.out.println("Enter the wage of the employee: ");
                        h.setWage_in_hour(Double.parseDouble(in.nextLine()));
                        System.out.println("Enter hours they worked of the employee: ");
                        h.setHours_worked(Double.parseDouble(in.nextLine()));
                        System.out.println(h.toString());

                        // Add the hourly to the array
                        for (int i = 0; i < employees.length; i++) {
                            if (employees[i] == null) {
                                employees[i] = h;
                                break;
                            }
                        }
                    }
                    //the category is volunteer
                    else if ("volunteer".equalsIgnoreCase(category)) {
                        
                        System.out.println("Enter the name of the employee: ");
                        v.setName(in.nextLine());
                        System.out.println("Enter the address of the employee: ");
                        v.setAddress(in.nextLine());
                        System.out.println(v.toString());

                        // Add the volunteer to the array
                        for (int i = 0; i < employees.length; i++) {
                            if (employees[i] == null) {
                                employees[i] = v;
                                break;
                            }
                        }
                    }
                    
                    break;

                case "2":
                    System.out.println("Enter the category of the employee");
                    category = in.nextLine();
                    if("executive".equalsIgnoreCase(category)){
                        e.delEmp(in.nextLine());
                    }
                    else if("monthly".equalsIgnoreCase(category)){
                        m.delEmp(in.nextLine());
                    }
                    else if("hourly".equalsIgnoreCase(category)){
                        h.delEmp(in.nextLine());
                    }
                    else if("volunteer".equalsIgnoreCase(category)){
                        v.delEmp(in.nextLine());
                    }
                    else{
                        System.out.println("Enter a vaild category");
                    }
                    break;

                case "3":
                    System.out.println("Enter the category of the employee");
                    category = in.nextLine();
                    if("executive".equalsIgnoreCase(category)){
                        System.out.println(e.getSalary());
                    }
                    else if("monthly".equalsIgnoreCase(category)){
                        System.out.println(m.getSalary());
                    }
                    else if("hourly".equalsIgnoreCase(category)){
                        System.out.println(h.getSalary());
                    }
                    else if("volunteer".equalsIgnoreCase(category)){
                        System.out.println("Voluteer employee don't have salary");
                    }
                    else{
                        System.out.println("Enter a vaild category");
                    }
                    break;

                case "4":
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
                    
            

        } while (!"4".equals(choice));

        in.close();
    }
}

