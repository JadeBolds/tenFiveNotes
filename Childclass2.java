package example;

public class Childclass2 extends ParentClass{

    private String hourly;

    //Constructor
    public Childclass2(String name) {
        //this means that it is calling the value
        // in the parenthesis from the class ABOVE it
        super(name);
    }

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

    @Override
    public void setEmployeeName(String employeeName) {
        super.setEmployeeName(employeeName);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    String printCustomerProfiles() {
        return null;
    }


    public String getHourly() {
        return hourly;
    }

    public void setHourly() {
        this.hourly = hourly;
    }

//    @Override
//    String printCustomerProfiles(){
//        return("Welcome " + this.employeeName + "!" + "/n"
//        + "Your status is: " + hourly + "/n" + "/n"
//        + customersName + "'s Profile:" + "/n"
//        + "Account Maturity: " + accountAge + "/n"
//        + "Has Points?" + hasPoints);
//    }

}