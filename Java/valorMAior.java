import java.util.Scanner;

public class valorMAior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial : ");
		int valorInicial = sc.nextInt();
		int valorFinal = 0; 
		
		boolean valorFinalMaiorQueInicial = false;
		do { 
			System.out.println("Digite o valor final  : ");
			valorFinal = sc.nextInt();
			
			if(valorFinal > valorInicial) { 
				valorFinalMaiorQueInicial = true;
			} else { 
				System.out.println("O numero final precisa ser maior que o inicial.");
			}
		} while (!valorFinalMaiorQueInicial);
		
		 for ( int i = valorInicial; i <= valorFinal ; i++) {
			 System.out.println(i);
		 }

	}

}
