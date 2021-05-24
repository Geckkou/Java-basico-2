import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entra = new Scanner (System.in);
		double divida, dividaFinal;
		float juros;
		int meses;
		
		System.out.println(" Valor da divida: ");
		divida = entra.nextDouble();
		System.out.println(" quantidade de parcelas: ");
		meses = entra.nextInt();
		
	    System.out.println(" juros em (%): ");
	    juros = entra.nextFloat();
	    juros = (float) (juros * (divida/100));
	    dividaFinal= meses + juros + divida;
	    System.out.println(" Total a pagar com juros: " + (float)dividaFinal);
//-----------------------------------------------------------------------------------------------------------------------------------------------
	    System.out.println();
	    System.out.println("Tabuada:");
	    
	    int contador = 1, result= 0;
	    Scanner x = new Scanner (System.in);
	    System.out.println(" Digite o número da tabuada ");
	    int nt = x.nextInt();
	    
	    while (contador <=10) {
	    	result= nt*contador;
	    	System.out.println(nt  +"x" +contador+ "=" +(result));
	    	contador ++;		
	    }
	}

}
