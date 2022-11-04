import java.util.Scanner;
public class IdadeUsuario {
	public static void main(String[] args) { 
		Scanner in =  new Scanner(System.in);
		double anoAt, anoNasc,idadaUsuario,resposta;
		do {
			System.out.println("insira o ano atual");
			anoAt=in.nextDouble();
			System.out.println("insira o ano de nascimento");
			anoNasc=in.nextDouble();	
			idadaUsuario=(anoAt-anoNasc);
			if(idadaUsuario<18) {
			System.out.println("menor de idade");
			}else if(idadaUsuario>=18) {
				System.out.println(idadaUsuario + "maior de idade"); 
			}
			System.out.println("deseja continuar?");
			resposta = in.nextInt();
		}while(resposta==1);
	}

}
