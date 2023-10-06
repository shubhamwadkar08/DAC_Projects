package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;
import custom_excpetions.InvalidInputException;

public class Utils {

	
public static HashMap<Integer,BankAccount> populateBankAccount() throws InvalidInputException
{
	HashMap<Integer,BankAccount> bankAccount=new HashMap<>();
	//String chasisNo, Color BankAccountColor, double basePrice, LocalDate manufactureDate, String company
	bankAccount.put(101,new BankAccount(101, "Virat", AccountType.SAVINGS, 150000.00, LocalDate.parse("2020-12-10")));
	bankAccount.put(109,new BankAccount(101, "Rohit", AccountType.CURRENT, 213000.00, LocalDate.parse("2020-12-10")));
	bankAccount.put(115,new BankAccount(101, "Dhoni", AccountType.SAVINGS, 301000.00, LocalDate.parse("2020-12-10")));
	bankAccount.put(106,new BankAccount(101, "Rahul", AccountType.FD, 402000.00, LocalDate.parse("2020-12-10")));
	bankAccount.put(103,new BankAccount(101, "Sachin", AccountType.NRE, 5050000.00, LocalDate.parse("2020-12-10")));
	bankAccount.put(108,new BankAccount(101, "Sehwag", AccountType.NRO, 109000.00, LocalDate.parse("2020-12-10")));
	bankAccount.put(121,new BankAccount(101, "Gambhir", AccountType.SAVINGS, 390000.00, LocalDate.parse("2020-12-10")));
	
	return bankAccount;

}
}
