package com.app.tester;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.banking.BankAccount;

import custom_excpetions.AccountOpeningDateComparator;
import custom_excpetions.InvalidInputException;
import utils.BankRulesValidation;
import utils.Utils;


public class Tester {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter how many accounts to add");
			
			HashMap<Integer,BankAccount> bankAccountHashMap= new HashMap<>();

			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("Enter options");
				System.out.println("1. Add customer");
				System.out.println("2. Display details of the customer");
				System.out.println("3. Deposit");
				System.out.println("4. Withdraw");
				System.out.println("5. Funds tranfer");
				System.out.println("6. Sort according to account number in ascending order");
				System.out.println("7. Exit");
				
				int a = sc.nextInt();
				
				switch (a) {
					
				case 1:	
					 
						System.out.println("Enter details for account accountNo,customer Name,account Type,account Balance,account Opening date ");
						int accountNo= sc.nextInt();
						bankAccountHashMap=Utils.populateBankAccount();
						BankRulesValidation.checkForDup(bankAccountHashMap,accountNo);
					break;
					
				case 2: 
						System.out.println(bankAccountHashMap);
						
					break;
			
				case 3:
						System.out.println("Enter account number to deposit in");
						accountNo=sc.nextInt();
						System.out.println("Enter amount to deposit");
						double amount= sc.nextDouble() ;
						
						BankAccount newBankAccount= new BankAccount(accountNo);
						boolean bool = bankAccountHashMap.containsKey(newBankAccount);
						
						if(!bool)
							throw new InvalidInputException("Invalid Input");
						else
							{
							for(BankAccount i : bankAccountHashMap.values()) {
								if(accountNo==i.getAccountNo()) {
									i.deposit(amount);
									System.out.println("New balance= "+ i.getAccountBalance());
								}
						}
						}
				
				break;
						
				
				case 4: 
						System.out.println("Enter account number to withdraw from");
						accountNo=sc.nextInt();
						System.out.println("Enter amount to withdraw");
						amount= sc.nextDouble() ;				
	
						newBankAccount= new BankAccount(accountNo);
						BankRulesValidation.checkForMinBal(bankAccountHashMap,accountNo,amount);
	
						bool=bankAccountHashMap.containsKey(newBankAccount);
						if(!bool)
							throw new InvalidInputException("Invalid Input");
						else
						{
						    for(BankAccount i :bankAccountHashMap.values()){
						    	if(accountNo==i.getAccountNo()) {
						    i.withdraw(amount);
							System.out.println("New Bal:"+i.getAccountBalance());
						    }
						    }
						}


					break;

						
					
				case 5: System.out.println("enter amount for fund tranfer");
						amount = sc.nextDouble();
						
						System.out.println("Enter source account");
						int sourceAccount= sc.nextInt();
						System.out.println("Enter destination account");
						int destinationAccount= sc.nextInt();
						
						//withdraw from source account
						newBankAccount= new BankAccount(sourceAccount);
						bool=bankAccountHashMap.containsKey(newBankAccount);
						if(!bool)
							throw new InvalidInputException("Invalid Input");
						else
						{
						    for(BankAccount i :bankAccountHashMap.values()){
						    	if(sourceAccount==i.getAccountNo()) {
						    i.withdraw(amount);
							System.out.println("New Bal:"+i.getAccountBalance());
						    }
						    }
						}
						
						//deposit in destination account
						newBankAccount= new BankAccount(destinationAccount);
						bool= bankAccountHashMap.containsKey(newBankAccount);
						
						if(!bool)
							throw new InvalidInputException("Invalid Input");
						else
							{
							for(BankAccount i : bankAccountHashMap.values()) {
								if(destinationAccount==i.getAccountNo()) {
									i.deposit(amount);
									System.out.println("New balance= "+ i.getAccountBalance());
								}
						}
						}
						
					break;
					
				case 6 : 
					System.out.println("sorting bank accounts");
							TreeMap<Integer, BankAccount> bankAccountTreeMap = new TreeMap<>(bankAccountHashMap);
							
								System.out.println(bankAccountTreeMap);
							
					break;
				case 7 : System.out.println("Sorting according to account opening date");
				
							List<BankAccount> bankObjects = new ArrayList<BankAccount> (bankAccountHashMap.values());
				
				 			Collections.sort(bankObjects, new AccountOpeningDateComparator());
		 			break;
				
				case 8 : System.out.println("Sorting according to account balance");
				List<BankAccount> bankObjects1 = new ArrayList<BankAccount> (bankAccountHashMap.values());
							Collections.sort(bankObjects1, new Comparator<BankAccount>()
									{
								@Override
								public int compare(BankAccount b1, BankAccount b2) {
									if(b1.getAccountBalance()< b2.getAccountBalance())
										return -1;
									if(b1.getAccountBalance()==b2.getAccountBalance())
										return 0;
									return 1;
								}
									}) ;
					break;
					
				case 9: exit = true;
			
					break;
				}
				}
			}
			
				catch(Exception e) {
					e.printStackTrace();
				}
			
		

	}

}

