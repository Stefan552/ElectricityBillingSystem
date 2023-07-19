public class Customer {
    private String customerId;
    private String customerName;
    private Integer previousReading;
    private Integer currentReading;

    public Customer ( ) {
    }

    public Customer( String customerId, String customerName, Integer previousReading, Integer currentReading) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public String getCustomerId ( ) {
        return customerId;
    }

    public void setCustomerId ( String customerId ) {
        this.customerId = customerId;
    }

    public String getCustomerName ( ) {
        return customerName;
    }

    public void setCustomerName ( String customerName ) {
        this.customerName = customerName;
    }

    public int getPreviousReading ( ) {
        return previousReading;
    }

    public void setPreviousReading ( Integer previousReading ) {
        this.previousReading = previousReading;
    }

    public int getCurrentReading ( ) {
        return currentReading;
    }

    public void setCurrentReading ( Integer currentReading ) {
        this.currentReading = currentReading;
    }
}
