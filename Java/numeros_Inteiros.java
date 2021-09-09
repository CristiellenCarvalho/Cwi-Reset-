import java.util.Scanner;

public class numeros_Inteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int a = sc.nextInt();
		System.out.println("Digite o primeiro numero");
		int b = sc.nextInt();
		
		int total = a + b;
				
				System.out.println("A soma dos numeros é = " + total);
		
		
		sc.close();

	}

}
