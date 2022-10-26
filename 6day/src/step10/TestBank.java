package step10;

import bank.hana.HanaBank;
import bank.kb.KbBank;

public class TestBank {

	public static void main(String[] args) {

		HanaBank hana = new HanaBank();
		KbBank kb = new KbBank();
		kb.deposit(500);
		System.out.println(hana.withdraw());

	}

}
