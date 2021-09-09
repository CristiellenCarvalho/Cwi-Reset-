import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double valorH , salario , hora;
		
		System.out.println("Digite a quantidade de horas trabalhadas :");
		hora = sc.nextDouble();
		
		System.out.println("Digite o valor da hora :");
		valorH = sc.nextDouble();
		
		salario = hora * valorH;
		
		System.out.printf("O valor do salario é : R$ %.2f%n" , salario );
		
		sc.close();

	}

}
