import java.util.Scanner;

public class AlunoAprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, media;
		
		System.out.println("Digite a primeira nota: ");
		a = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		b = sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		c = sc.nextInt();
		System.out.println("Digite a quarta nota: ");
		d = sc.nextInt();
		
		media = (a + b + c + d) / 4 ;
		
		if(media == 10) { 
			System.out.println("Aluno Aprovado com louvores .");
		} else if ( media >= 7) {
			System.out.println("Aluno Aprovado.");
		} else { 
			System.out.println("Aluno reprovado .");
		}
			
		
		sc.close();


	}

}
