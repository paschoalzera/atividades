
package Triangulo;
import java.util.Scanner;
public class Triangulo {
public static void main(String args[]) {
Scanner in= new Scanner(System.in);
double a,b,c,trianguloIsosceles;
System.out.println("leia o valor de A");
a= in.nextDouble();
System.out.println("Leia o valor de B");
b= in.nextDouble();
System.out.println("Leia o valor de C");
c= in.nextDouble();
System.out.println("Leia o tipo de triangulo é: triangulo isosceles");
System.out.println("area é: base*altura(/2)");
if(a+b >c & a+c >b & b+c >a){
System.out.println("é um triangulo");
} else if(a==b & a==c) {
System.out.println("triangulo Equilatero");
} else if(a==b & a==c & b==c) {
System.out.println("triangulo isosceles");
} else {
System.out.println("não é um traingulo");
}
}
}