import java.util.Scanner;

public class diaDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero da semana - [1 -7] ");
		
		int  diaSemana = sc.nextInt();
		
		switch(diaSemana) {
		
		case 1 : 
			System.out.println("Domingo");
			break;
			
		case 2 : 
			System.out.println("Segunda");
			break;
			
		case 3 : 
			System.out.println("Ter�a");
			break;	
		
		case 4 : 
			System.out.println("Quarta");
			break;
		
		case 5 : 
			System.out.println("Quinta");
			break;
		
		case 6 : 
			System.out.println("Sexta");
			break;
			
		case 7 : 
			System.out.println("Sabado");
			break;
			
		default:
			System.out.println("Valor inv�lido");
			break;
		}
		
		
	}

}
