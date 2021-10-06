package example;

public interface CustomerProfile {


    String getEmployeeName();
    void setEmployeeName(String employeeName);

    String getCustomerName();
    void setCustomerName(String employeeName);

    int getAccountAge();
    void setAccountAge(int accountAge);

    default Boolean getHasPoints(){
        return null;
    }
}
