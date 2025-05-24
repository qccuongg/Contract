public class Client {
    public void requestCreateRentalContract(Contract contractBuilder) {
        contractBuilder.buildContractID();
        contractBuilder.buildTenantID();
        contractBuilder.buildPropertyID();
        contractBuilder.buildRentAmount();
        Contract signedContract = contractBuilder.signContract();

        System.out.println("Contract created: " + signedContract);
    }

    public static void main(String[] args) {
        Client client = new Client();

        Contract permanent = new Permanent();
        client.requestCreateRentalContract(permanent);

        Contract longTerm = new LongTerm();
        client.requestCreateRentalContract(longTerm);

        Contract shortTerm = new ShortTerm();
        client.requestCreateRentalContract(shortTerm);
    }
}
