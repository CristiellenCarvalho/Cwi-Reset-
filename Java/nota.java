import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma nota entre zero e dez: ");

        boolean notaValida = false;
        do {
            double notaInformada = scan.nextDouble();
            if (notaInformada >= 0 && notaInformada <= 10) {
                notaValida = true;
                System.out.println("Nota v�lida: " + notaInformada);
            } else {
                System.out.println("Nota inv�lida! Informe uma nota entre zero e dez.");
            }

        } while (!notaValida);


	}

}
