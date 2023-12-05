package atu.ie;

public class Customer extends Person{
    private String customerNumber;
    private boolean mailingList;

    public Customer(){
    }
    public Customer(String name, String address, String telephone, String customerNumber, boolean mailingList){
        super(name,address,telephone);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
