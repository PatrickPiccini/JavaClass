/* Exemplo de implementação de polimorfismo.
 * instanciamos uma lista do tipo Employee porem pode mudar o tipo especifico de cada funcionario
 * é usado o @override para sobreescrever um metodo se a caso for do tipo OutsourceEmployee
 *
*/


package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
 
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #"+ n + " data: ");
			System.out.print("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionCharge = sc.nextDouble();

				list.add(new OutsourceEmployee (name, hours, valuePerHour, additionCharge));
			}else {
				
				list.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName()+ " - R$"+ String.format("%.2f", emp.payment()));
			
		}
		sc.close();
	}
}
