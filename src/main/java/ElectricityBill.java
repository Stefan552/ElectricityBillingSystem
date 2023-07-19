public class ElectricityBill {
    private Customer customer;
    private Double unitRate;

    public ElectricityBill(Customer customer, Double unitRate) {
        this.customer = customer;
        this.unitRate = unitRate;
    }

    public double calculateTotalUnitsConsumed() {
        return customer.getCurrentReading() - customer.getPreviousReading();
    }

    public double calculateTotalAmount() {
        double totalUnits = calculateTotalUnitsConsumed();
        return totalUnits * unitRate;
    }

    public Customer getCustomer ( ) {
        return customer;
    }

    public void setCustomer ( Customer customer ) {
        this.customer = customer;
    }

    public double getUnitRate ( ) {
        return unitRate;
    }

    public void setUnitRate ( double unitRate ) {
        this.unitRate = unitRate;
    }
}
