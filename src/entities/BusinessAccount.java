<<<<<<< HEAD
package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(String holder, Integer account, Double balance, Double loanLimit) {
		super(holder, account, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit() {
		this.loanLimit = loanLimit;
	}
	
	public void loan (double amount) {
		if (amount <= loanLimit) {
		balance += amount - 10.0;
		}
	}
	
}
=======
package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(String holder, Integer account, Double balance, Double loanLimit) {
		super(holder, account, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit() {
		this.loanLimit = loanLimit;
	}
	
	public void loan (double amount) {
		if (amount <= loanLimit) {
		balance += amount - 10.0;
		}
	}
	
}
>>>>>>> b2ffb9a51b462129d0b0379f1e67035bc7c51a85
