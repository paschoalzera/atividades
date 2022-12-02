import java.util.Scanner;
public class DescontoDoValeTransporte {
	public static void main (String[]args) {
		double salariobruto,desconto,salariodescontado;
		Scanner in=new Scanner(System.in);
		System.out.println ("coloque seu salario");
		salariobruto=in.nextDouble();
		System.out.println("digite o valor do desconto");
		desconto=in.nextDouble();
		salariodescontado=salariobruto*desconto/100;
		System.out.println("o  valor do desconto do é igual"+  salariodescontado);
	}
	

}
