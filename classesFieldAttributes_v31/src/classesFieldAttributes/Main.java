package classesFieldAttributes;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {
		//Constructor Örneği
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		
		//Getter-Setter Örneği
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Monster Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		*/
		System.out.println(product.getKod());
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		
	}

}
