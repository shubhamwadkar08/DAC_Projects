package com.app.banking;

public enum AccountType {
	SAVINGS(10000.00), CURRENT(10000.00),FD(25000.00),NRE(10000.00), LOAN(5000.00), NRO(100000.00);
		private double minBalance;
		private AccountType(double minBal) {
			this.minBalance=minBal;
			
		}
		public double getMinBalance() {
			return minBalance;
		}
		public void setMinBalance(double minBalance) {
			this.minBalance = minBalance;
		}
		
//		public String valueOf(AccountType type) {
//			return AccountType.valueOf(type);
//		}
}
