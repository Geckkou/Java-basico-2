import java.util.*;
public class Exercicio_SomaCincoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner (System.in);
	int y;
	int z = 0;
		 System.out.println("digite um valor a ser somado");
		 y = x.nextInt();
				 
	while (y <=5) {
		z = z + y;
		y ++;
			
	}
	System.out.println(" soma dos 5= " + z);	
//-------------------------------------------------------------------------------------------------------------------------------------------------
     
	System.out.println();
	System.out.println(" calculando ano bissexto ");
	
	Scanner inf = new Scanner (System.in);
	int ano;
	System.out.println("digite o ano que você deseja");
	ano = inf.nextInt();
	
	if (ano % 4 == 0 && ano % 100 !=0 || ano % 400 == 0) {
		System.out.println(ano + "é bissexto");
	}else {
		System.out.println(ano + " não é bissexto ");
		
	}
	
	}

}


   
    