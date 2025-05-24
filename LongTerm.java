public class LongTerm implements Contract {
    private String contractID;
    private String tenantID;
    private String propertyID;
    private double rentAmount;

    @Override
    public void buildContractID() {
        this.contractID = "LONG" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID() {
        this.propertyID = "Property456";
    }

    @Override
    public void buildTenantID() {
        this.tenantID = "TenantDEF";
    }

    @Override
    public void buildRentAmount() {
        this.rentAmount = 1500.0;
    }

    @Override
    public Contract signContract() {
        return this;
    }

    @Override
    public String toString() {
        return "Long-term Contract [ContractID=" + contractID + ", TenantID=" + tenantID + ", PropertyID=" + propertyID + ", RentAmount=" + rentAmount + "]";
    }
}
