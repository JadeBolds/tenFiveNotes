package example;

public abstract class ParentClass implements CustomerProfile{

    private String employeeName;
    private String customerName;
    private int accountAge;
    private Boolean hasPoints;

    //Constructor
    public ParentClass(String name) {
        this.customerName = name;
    }

    //Customer name getter
    public String getCustomerName() {
        return customerName;
    }

    //Customer name setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //This is creating the template for
    //this value to be called and used in subclasses
    public int getAccountAge() {
        return accountAge;
    }

    //Account Age Setter
    public void setAccountAge(int accountAge) {
        this.accountAge = accountAge;
    }

    //Account Age getter
    public Boolean getHasPoints() {
        return hasPoints;
    }

    //hasPoints setter
    public void setHasPoints(Boolean hasPoints) {
        this.hasPoints = hasPoints;
    }

    //Employee name getter
    public String getEmployeeName() {
        return employeeName;
    }

    //Employee name setter
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "employeeName='" + employeeName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accountAge=" + accountAge +
                ", hasPoints=" + hasPoints +
                '}';
    }

    abstract String printCustomerProfiles();

    protected String setAccountAge() {
        return null;
    }

    protected String setHasPoints() {
        return null;
    }
}
