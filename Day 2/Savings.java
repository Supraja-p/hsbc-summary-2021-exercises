package beans;

public class Savings {
	private long accountNumber;
	private double balance;
	private String ifsc;
	private long dailyLimit;

	public Savings(long accountNumber, double balance, String ifsc, long dailyLimit) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ifsc = ifsc;
		this.dailyLimit = dailyLimit;
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

	public long getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(long dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	@Override
	public String toString() {
		return "Savings [accountNumber=" + accountNumber + ", balance=" + balance + ", ifsc=" + ifsc + ", dailyLimit="
				+ dailyLimit + "]";
	}

}
