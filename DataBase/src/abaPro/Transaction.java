package abaPro;

public class Transaction {

	private int transactionId;
	private String transactiontype;
	private double amount;
	private int accountNum;
	
	public Transaction(int transactionId, String transactiontype, double amount, int accountNum) {
		super();
		this.transactionId = transactionId;
		this.transactiontype = transactiontype;
		this.amount = amount;
		this.accountNum = accountNum;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactiontype=" + transactiontype + ", amount="
				+ amount + ", accountNum=" + accountNum + "]";
	}
	
	
	
}
		

			
			