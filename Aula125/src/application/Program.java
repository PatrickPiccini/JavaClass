/*Programa que ensina Upcasting e Downcasting
Upcasting significa como se voce atribuisse um objeto da sub-classe para super-classe(uso comun em polimorfismo)
Downcasting significa como se voce atribuisse um objeto da super-classe para sub-classe

O comando "instanceof" serve para testar se a variavel A é um objeto que seja instâcia de B, ae sim da pra fazer o Casting
*/

package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "patrick", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//essa operação vai dar problema porque o compilador acha q o acc3 é um Acount porem é um SavingsAccount 
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		/*
		if (acc3 instanceof BusinessAccount) {
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		*/
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updatebalance();
			System.out.println("Update");
			
		}
		
	}

}
