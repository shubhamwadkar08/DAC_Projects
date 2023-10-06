package com.app.banking;

import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount> {
	//wrapper classes
	private Integer accountNo;
	private String customerName;
	private AccountType accountType;
	private Double accountBalance;
	private LocalDate accountOpeningDate;
	protected Double amount;
	
	
	public BankAccount(Integer accNo, String cName, AccountType accType, Double accBal, LocalDate accOpen) {
		super();
		accountNo= accNo;
		customerName= cName;
		accountType=accType;
		accountBalance=accBal;
		accountOpeningDate= accOpen;
	}
	
	public BankAccount(Integer accNo) {
		super();
		this.accountNo=accNo;
	}


	public BankAccount(AccountType type) {
		super();
		this.accountType=type;
}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", customerName=" + customerName + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + ", accountOpeningDate=" + accountOpeningDate + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		 
		BankAccount other = (BankAccount) obj;
		System.out.println(other);
		return this.accountNo.equals(other.accountNo);
		
	}
	public boolean withdraw(double amount) {
		//this.accountNo= sourceAccount;
		this.setAccountBalance(this.accountBalance- amount);
		System.out.println("balance after withdrawal= "+ this.getAccountBalance());
		return true;
		
	}
	
	
	public boolean deposit(double amount) {
		this.setAccountBalance(this.accountBalance+ amount);
		System.out.println("balance after deposit= "+ this.getAccountBalance());
		return true;
	}
//	public boolean fundTranfer(double amount, BankAccount b) {
//		this.accountNo.
//	}
//	
	
	@Override
	public int compareTo(BankAccount o) {
		System.out.println("in BankAccount compareTo");
		return this.accountNo.compareTo(o.accountNo);
	}
	
	
	
	
	
	public Integer getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public AccountType getAccountType() {
		return accountType;
	}


	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


	public Double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}


	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	

	
	
}

