package application;

import model.entity.Client;

public class Program {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("Comparando por atributos: " + c1.equals(c2));
		
/* 		comparando os objetos e n�o os atributos, nessse caso o equals da falso, pois cada
		objeto tem sua posi��o no heap.
		utilizando em casos que todos os atributos s�o igual, o objeto nunca sera o mesmo.
 */		
		System.out.print("Comparando objetos: ");
		System.out.println(c1 == c2);
		
	}

}
