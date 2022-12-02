package média;
import java.util.Scanner;
public class media {
		public static void main(String args[]) {
		Scanner in=new Scanner (System.in);
		double n1,n2,n3,m,m2;
		System.out.println("leia a primeira nota");
		n1=in.nextDouble();
		System.out.println("leia a segunda nota");
		n2=in.nextDouble();
		if (n1+n2/2) {
		System.out.println("media é:");
		m=in.nextDouble();
		if(m>6 ) {
		System.out.println("Aprovado!");
		}else if(m<3){
		System.out.println("Reprovado!");
		}else if(m>=3 & m<=6 ){
		System.out.println("está em Exame!");
		System.out.println("Digite a nota do Exame:");
		n3= in.nextDouble();
		m2= (n1+n2+n3)/2;
		if(m2>6) {
		System.out.println("Esta Aprovado!");
		}else if(m2<6) {
		System.out.println("Esta Reprovado!");
				}	
			}
		}
	}
}
