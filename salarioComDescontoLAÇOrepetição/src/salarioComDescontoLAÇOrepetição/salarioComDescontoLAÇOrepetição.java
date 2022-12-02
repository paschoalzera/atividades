package salarioComDescontoLAÇOrepetição;
import java.util.Scanner;
public class salarioComDescontoLAÇOrepetição {
		public static void main (String args[]){
			Scanner in = new Scanner (System.in);
			int i=1;
			double salario,desconto;
			while(i<=4) {
				System.out.println("digite o salario do"  +i+  "funcionario");
				salario = in.nextDouble();
				if (salario<2000) {
					desconto = (salario*8.5/100);
					System.out.println("o desconto do seu salario é de "+desconto );
				} 	else {
						desconto =(salario*11/100);
						System.out.println("o desconto do seu salario é de "+desconto);
				}
				i++;	
			}
		}	
	}

