import java.util.Scanner;
public class tabuada {
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		int i=1;
		int num,tabuada;
		System.out.println("digite o numero inteiro ");
		num =in.nextInt();
		while(i<=10) {
			tabuada=(num*i);
			System.out.println(tabuada);
			i++;
		}
	
		}
}
