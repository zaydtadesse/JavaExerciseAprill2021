package abaPro;

public class Transfer {
	private int transferId;
	private int fromAccount;
	private int toAccount;
	private double amount;
	private double reason;
	
	public Transfer(int transferId, int fromAccount, int toAccount, double amount, double reason) {
		super();
		this.transferId = transferId;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.reason = reason;
	}

	public int getTransferId() {
		return transferId;
	}

	public void setTransferId(int transferId) {
		this.transferId = transferId;
	}

	public int getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}

	public int getToAccount() {
		return toAccount;
	}

	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getReason() {
		return reason;
	}

	public void setReason(double reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "Transfer [transferId=" + transferId + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", amount=" + amount + ", reason=" + reason + "]";
	}
	
	


		

	}


