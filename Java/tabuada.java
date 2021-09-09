import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		System.out.println("Digite o numero da tabuada que deseja ver : ");
		
		Scanner sc = new Scanner(System.in);
	 
		int n = sc.nextInt();
	
		for (int i = 0; i <= 10 ; i++) { 
			int resultado = n * i;
			System.out.println(n + " X " + i + " = " + resultado );
		}
	
	
		
	}

}
