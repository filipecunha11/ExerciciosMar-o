package posArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
	
	int[] est = new int[]{2, 4, 6, 8};
	private Scanner scanner;
	
	public Exercicio1(){
		int num;
		scanner = new Scanner(System.in);
		do {
			System.out.println("\nMenu ");
			System.out.println("1. Inserir\n2. Eliminar\n3. Verificar\n\n> ");
			
			int menu = scanner.nextInt();
			
			switch (menu)
			{
			case 1:
				System.out.print("\nInsira um numero: ");
				num = scanner.nextInt();
				addNumber(num);
				break;
			case 2:
				System.out.print("\nInsira a posição a eliminar: ");
				num = scanner.nextInt();
				delNum(num);
				break;
			case 3:
				showArray(est);
				break;
			}
		} while (true);
	}
	
	private void showArray(int[] arr) {
		System.out.println("\nArray: " + Arrays.toString(arr));
	}

	public int[] addNumber(int newNumber) {
		est = Arrays.copyOf(est, est.length+1);
		est[est.length-1] = newNumber;
		return est;
	}
	
	public int[] delNum (int pos){
		for (int i = pos ; i < est.length  ; i++ )
			if (i != est.length-1)
				est[i] = est[i+1];
		return est = Arrays.copyOf(est, est.length-1);
	}
}
