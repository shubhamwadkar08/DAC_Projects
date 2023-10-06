package custom_excpetions;

import java.util.Comparator;

import com.app.banking.BankAccount;

public class AccountOpeningDateComparator implements Comparator<BankAccount>{
	
	@Override
	public int compare(BankAccount b1, BankAccount b2) {
		if(b1.getAccountOpeningDate().isBefore(b2.getAccountOpeningDate()))
			return -1;
		if(b1.getAccountOpeningDate().isEqual(b2.getAccountOpeningDate()))
			return 0;
		return 1;
	}

	
}
