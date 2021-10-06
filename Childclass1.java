package example;


public class Childclass1 extends ParentClass {

    private String customerCardInfo;
    private String salary;
    private int employeesWorking;

    //Constructor
    public Childclass1(String name) {
        //this means that it is calling the value
        // in the parenthesis from the class ABOVE it
        super(name);
    }

//    public Childclass1() {
//        super();
//    }

    @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }

    @Override
    public int getAccountAge() {
        return super.getAccountAge();
    }

    @Override
    public void setAccountAge(int accountAge) {
        super.setAccountAge(accountAge);
    }

    @Override
    public Boolean getHasPoints() {
        return super.getHasPoints();
    }

    @Override
    public void setHasPoints(Boolean hasPoints) {
        super.setHasPoints(hasPoints);
    }

    @Override
    public String getEmployeeName() {
        return super.getEmployeeName();
    }


//
//    @Override
//    public String toString() {
//        return super.toString();
//    }


    public String getCustomerCardInfo() {
        return customerCardInfo;
    }

    public void setCustomerCardInfo(String customerCardInfo) {
        this.customerCardInfo = customerCardInfo;
    }

    public String getSalary() {
        return salary;
    }

//    public void setSalary(String salary) {
//        salary = this.salary;
//    }

    public int getEmployeesWorking() {
        return employeesWorking;
    }

    public void setEmployeesWorking(int employeesWorking) {
        this.employeesWorking = employeesWorking;
    }

    @Override
    String printCustomerProfiles(){
        return("Welcome " + super.getEmployeeName() + "!" + "/n"
                + "Your status is: " + salary + "/n"
                + " You have " + employeesWorking + " employees working."
                +"/n" + "/n"
                + "Account Maturity: " + super.setAccountAge() + "/n"
                + "Has Points?" + super.setHasPoints());
    }
//    public String customerCardInfo() {
//        return customerCardInfo;
//    }
//
//    public void customerCardInfo(String customerProfile) {
//        this.customerCardInfo = customerCardInfo;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
}
