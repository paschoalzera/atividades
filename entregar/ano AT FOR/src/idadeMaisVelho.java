import java.util.Scanner;
public class idadeMaisVelho {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		double anoAt, anoNasc,UsuarioVelho=0,UsuarioNovo=0,idadeNova;
		int i;
		System.out.println("insira o ano atual");
		anoAt=in.nextDouble();
		for(i=1;i<=10;i++){
			System.out.println("insira o ano de nascimento");
			anoNasc=in.nextDouble();	
			idadeNova=(anoAt-anoNasc);
			if(idadeNova>=UsuarioVelho) {
				UsuarioVelho=idadeNova;
			}else if(idadeNova<=UsuarioVelho);
			 	UsuarioNovo=idadeNova;
		}
			System.out.println(UsuarioVelho+ "idade do mais velho");
			System.out.println(UsuarioNovo+ "idade do mais novo");
	}
}
	