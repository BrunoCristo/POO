import java.util.Scanner;

public class Main {

	public static void main (String[] args){
		
		char opcao = ' ';
		Scanner sc = new Scanner(System.in);
		Soma a = new Soma();	
		System.out.println("| MENU           |");
		System.out.println("| 1- SOMA        |");
		System.out.println("| 2- SUBTRAIR    |");
		System.out.println("| 3- MULTIPLICAR |");
		System.out.println("| 4- DIVIR       |");
		System.out.println("| 5- POTENCIA    |");
		opcao = sc.next().charAt(0);
		float num1;
		float num2;
		switch(opcao){
			case '1':
				System.out.println("Soma");
				System.out.println("Numero 1: ");
				num1 = sc.nextFloat();
				System.out.println("Numero 2: ");
				num2 = sc.nextFloat();
				System.out.println("Somar: " + a.somar(num1,num2));
				break;
			case '2':
				System.out.println("Subtrair");
				System.out.println("Numero 1: ");
				num1 = sc.nextFloat();
				System.out.println("Numero 2: ");
				num2 = sc.nextFloat();
				System.out.println("Subtrair: " + a.subtrair(num1,num2));
				break;
	///		case '3':
	///			System.out.println("Multiplicar");
	///			break;
	///		case '3':
	///			System.out.println("Multiplicar");
	///			break;
	///		case '4':
	///			System.out.println("Dividir");
	///			break;
	///		case '5':
	///			System.out.println("Potencia");
	///			break;
	}	
		
///		System.out.println("Somar: " + a.somar(2,9));
///		System.out.println("Subtrair: " + a.subtrair(2,9));
		
		///System.out.println("Muitiplicar: "+a.multiplicacao(2,9));
		///System.out.println("Dividir: "+a.divisao(2,9));
		///System.out.println("Potencializar: "+a.potencia(2,9));
		
		
	}
	
}
