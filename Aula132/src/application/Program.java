/*Nessa aula é aprendido como fazer com que uma clase seja abstrata.
 * Isso faz com que ela não possa ser instanciada, fazendo com que não garanta uma herança total
 * somente as subclasses podem ser instanciadas, mas nunca a superclasse abstrada #account esta ab strata#
 * 
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "patrick", 500.00, 0.01));
		list.add(new SavingsAccount(1002, "bob", 1000.00, 0.01));
		list.add(new BusinessAccount(1003, "ana", 300.00, 400.0));
		list.add(new BusinessAccount(1004, "maria", 500.00, 500.0));
		
		
		double sum = 0.0;
		
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
				
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}
}