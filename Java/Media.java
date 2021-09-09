import java.util.Scanner;

public class Media {

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
				
				System.out.println("A media das notas digitadas é :" + media);
		
		sc.close();

	}

}
