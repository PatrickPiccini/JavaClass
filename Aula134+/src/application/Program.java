/*Nesse exercicio de fixação foiutilizado Polimorfismo, classes e metodos abstratos, Upcasting e sobreposição de metodos
 * 
 */

package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<People> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1; i<=n ;i++) {
			System.out.println("Tax payer #"+n+" data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Health expenditures: ");
				double spentHealth = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, spentHealth));
					
			} else if(ch == 'c'){
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
	
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		for(People pl : list) {
			System.out.println(pl.getName()+": R$ "+ String.format("%.2f",pl.tax()));
			sum += pl.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: R$ ", String.format("%.2f", sum));
		
		sc.close();
	}
}
