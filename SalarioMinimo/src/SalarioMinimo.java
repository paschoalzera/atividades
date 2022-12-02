import java.util.Scanner;
public class SalarioMinimo {
	public static void main (String[] args) {
		double salario;
		Scanner in= new Scanner (System.in);
		System.out.println ("Digite o seu Salário:");
		salario= in.nextDouble ();
		if(salario>954.00) {
			System.out.println ("O salário está a cima");
			}
		else {
			System.out.println ("O salário está a baixo");
			}
		in.close();
	}
		
}


