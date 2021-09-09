import java.util.Scanner;

public class cincoNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		
		int num = 0; 
		int maior = Integer.MIN_VALUE;
		
		for( int i = 0 ; i <5 ; i++) { 
			System.out.println("informe um numero: ");
			num = sc.nextInt();
			
			if( num > maior) {
				maior = num;
			}
		}
		System.out.println("O maior numero foi " + maior);
	}

}
