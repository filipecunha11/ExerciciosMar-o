package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exer21 {

	public Exer21()
	{
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("b");
		lista.add("3");
		lista.add("Carruagens");
		lista.add("8.56");
		lista.add("caixas de armazenamento");
		
		showArray(lista);
		
		System.out.println("\nO que pretende inserir?");
		addValue(new Scanner(System.in).nextLine(), lista);
		
		showArray(lista);
	}
	
	private void showArray(ArrayList<String> lista) {
		System.out.println("\nArray: " + lista);
	}

	
	public ArrayList<String> addValue(String valor, ArrayList<String> lista) {
		lista.add(valor);
		return lista;
	}
}
