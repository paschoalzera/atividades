package triangulinho;
import java.util.Scanner;
public class trianguloBermuda {
	public static void main(String args[]) {
	Scanner in= new Scanner(System.in);
	double a,b,c,trianguloIsosceles;
	System.out.println("leia o valor de A");
	a= in.nextDouble();
	System.out.println("Leia o valor de B");
	b= in.nextDouble();
	System.out.println("Leia o valor de C");
	c= in.nextDouble();
	if(b >c & a+c >b & b+c >a){
		System.out.println(" triangulo escaleno");
		} else if(a<=b & a<=c & c<=b) {
			System.out.println("triangulo Equilatero");
		} else if(a<=b) {
			System.out.println("triangulo isosceles");
		} else {
			System.out.println("não é um tringulo");
			in.close();
			}
		}
	}

