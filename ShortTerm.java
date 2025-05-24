public class ShortTerm implements Contract {
    private String contractID;
    private String tenantID;
    private String propertyID;
    private double rentAmount;

    @Override
    public void buildContractID() {
        this.contractID = "SHORT" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID() {
        this.propertyID = "Property789";
    }

    @Override
    public void buildTenantID() {
        this.tenantID = "TenantGHK";
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
        return "Short-term Contract [ContractID=" + contractID + ", TenantID=" + tenantID + ", PropertyID=" + propertyID + ", RentAmount=" + rentAmount + "]";
    }
}
