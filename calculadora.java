package algoritimos;

import java.util.Scanner;

public class Pratica17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("Soma, Subtração, Multiplicação e Divisão");
		System.out.print("Insira o primeiro número: ");
		float n1 = sc.nextFloat();
		if (n1<1 || n1>100) {System.out.println("Inválido! O valor tem que ter o intervalo fechado entre 1 a 100!");
			
			
		} else {
		System.out.print("Insira o valor do segundo número: ");
		float n2 = sc.nextFloat();
		if (n2<1||n2>100) {System.out.println("Inválido! O valor tem que ter o intervalo fechado entre 1 a 100!");
			
		} else {
		System.out.print("Insira qual a operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n-> ");
		int ch = sc.nextInt();
		sc.close();
		
		switch (ch) {
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3 :
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
		
		default:
			break;
		}

		}

		}
		

	}

}