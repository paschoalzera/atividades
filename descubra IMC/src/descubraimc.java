import java.util.*;
public class descubraimc {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		double peso,altura,imc;
		System.out.println("Apresente seu peso:");
		peso=in.nextDouble();
		System.out.println("Apresente sua altura :");
		altura=in.nextDouble();
		imc=(peso/(altura*altura));
		System.out.println("mostrar imc do usuario:"+imc);
		if(imc<=18.5) {
			System.out.println("excesso de magreza");
		} else if(imc<=25) {
			System.out.println("peso normal");
		} else if(imc<=30) {
			System.out.println("excesso de peso");
		} else if(imc<=35) {
			System.out.println("Obesidade Grau I");
		} else if(imc<=40) {
			System.out.println("Obesidade Grau II");
		in.close();
		}
	}
}