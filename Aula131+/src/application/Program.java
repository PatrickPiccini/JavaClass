/*Foi implementado o exercicio de fixação da aula 131, onde foi usado polimorfismo,
 * sobreosição usando o @override, herança e O.O
 * 
 */


package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Product #"+ n +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				productList.add( new ImportedProduct(name, price, customsFee));
			} 
			else if(ch == 'c'){
				productList.add( new Product(name, price));				
			} 
			else {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				productList.add( new UsedProduct(name, price, manufactureDate));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product pl : productList) {
			System.out.println(pl.priceTag());
		}
		
		sc.close();
	}
}
