package utils;

import java.util.HashMap;

import com.app.banking.BankAccount;

import custom_excpetions.InvalidInputException;

public class BankRulesValidation  {

	
	public static void checkForDup(HashMap<Integer,BankAccount> hashMap, int accNo) throws InvalidInputException {
		if( hashMap.containsKey(new BankAccount(accNo)))
			throw new InvalidInputException("Duplicate account found...please enter diferent account number");
		else
			System.out.println("No duplicate accounts found");
	}

	
	public static boolean checkForMinBal(HashMap<Integer,BankAccount> hashMap,int accNo,double amount) throws InvalidInputException {
		BankAccount b = hashMap.get(hashMap.containsKey(new BankAccount(accNo)));		
		double minBal= b.getAccountType().getMinBalance();
		
		if ((b.getAccountBalance()-amount)< minBal)
			throw new InvalidInputException("Amount less than minimum balance. Cannot perform operation");
		System.out.println("Ok.Withdraw operation can be done");
		return true;
	}
	
//	public static boolean checkForNegativeBalance(double amountToWithDraw ,double balanceAfterWithdrawal) throws InvalidInputException{
//		if(amountToWithDraw < balanceAfterWithdrawal)
//			throw new InvalidInputException("Cannot withdraw as balance goes to negative");
//			System.out.println("Ok. operation can be done");
//			return true;
//	}
	
}
