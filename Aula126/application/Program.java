/*é possivel fazer a sobreposição de metodos uzando o @Override.
 O @Override sobreescreve o metodo na super-classe que ja existe se a caso tiver algo diferente q queira ter nesse novo metodo(Exemplo no SavingAccount)
 
 Utilização do "super" mada usar os metodos da super-classe em outras sub-classes(exemplo no BusinessAccount)
*/

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//usa o metodo sem o Override da classe Account
		Account acc1 = new Account(1001, "patrick", 1000.0);
		acc1.withdraw(200);
		System.out.println(acc1.getBalance());
		
		//usa o metoso com o Override da classe SavingsAccount
		Account acc2 = new SavingsAccount(1002, "patrick", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//usa o metoso com o Override da classe BusinessAccount
		Account acc3 = new BusinessAccount(1003, "patrick", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
		
	}

}
