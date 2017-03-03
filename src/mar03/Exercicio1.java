package mar03;

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
			System.out.println("1. Inserir");
			System.out.println("2. Eliminar");
			System.out.println("3. Verificar");
			System.out.print("0. Sair\n> ");
			
			int menu = scanner.nextInt();
			
			if (menu == 1)
			{
				System.out.print("\nInsira um numero: ");
				num = scanner.nextInt();
				addNumber(num);
			}
			else if (menu == 2)
			{
				System.out.print("\nInsira a posição a eliminar: ");
				num = scanner.nextInt();
				delNum(num);
			}
			else if (menu == 3)
				showArray(est);
			else if (menu == 0)
				break;
		} while (true);
	}
	
	private void showArray(int[] arr) {
		System.out.print("\n\nArray: ");
		for (int i = 0 ; i < arr.length-1 ; i++)
			System.out.print(arr[i] + ", ");
		System.out.print(arr[arr.length-1]);
	}

	public int[] addNumber(int newNumber) {
		est = Arrays.copyOf(est, est.length+1);
		est[est.length-1] = newNumber;
		return est;
	}
	
	public int[] delNum (int pos){
		for (int i = pos ; i < est.length  ; i++ )
		{
			if (i != est.length-1)
				est[i] = est[i+1];
		}
		est = Arrays.copyOf(est, est.length-1);
		return est;
	}
}
