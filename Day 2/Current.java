package beans;

public class Current {
	private long accountNumber;
	private double balance;
	private String ifsc;
	private String nomineeName;

	public Current(long accountNumber, double balance, String ifsc, String nomineeName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ifsc = ifsc;
		this.nomineeName = nomineeName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	@Override
	public String toString() {
		return "Current [accountNumber=" + accountNumber + ", balance=" + balance + ", ifsc=" + ifsc + ", nomineeName="
				+ nomineeName + "]";
	}

}
