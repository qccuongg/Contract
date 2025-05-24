public class Permanent implements Contract {
    private String contractID;
    private String tenantID;
    private String propertyID;
    private double rentAmount;

    @Override
    public void buildContractID() {
        this.contractID = "PERM" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID() {
        this.propertyID = "Property123";
    }

    @Override
    public void buildTenantID() {
        this.tenantID = "TenantABC";
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
        return "Permanent Contract [ContractID=" + contractID + ", TenantID=" + tenantID + ", PropertyID=" + propertyID + ", RentAmount=" + rentAmount + "]";
    }
}
