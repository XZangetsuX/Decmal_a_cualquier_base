package a_hexadecimal_y_mas;

import java.util.Scanner;

public class convertsio_de_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertsio_de_decimal c = new  convertsio_de_decimal();
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Inrodusca el numero a calcular");
		int numero=Integer.parseInt(entrada.nextLine());
		System.out.println("Inrodusca la base");
		int base=Integer.parseInt(entrada.nextLine());
		
		System.out.println(" Numero: "+numero+"\n Base: "+base+"\n Resutado: "+c.hexa(numero, base));
		

	}
	
	
		
	
	

	
	private String hexa(int n,int b) {
		char [] num= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int resu2=n/b;
		//System.out.println(resu2);
		n= n%b;
;		//System.out.println(n);
		if(resu2==0) {
			return ""+num[n];
		}else {
			//System.out.println();
			return hexa (resu2,b)+num[n] ;
		}
		
		
	}
	
	

}
