
public class Orientação_Objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orientação_Objeto ei;
		ei = new Orientação_Objeto();
		ei.exibir();

	}

	public void exibir() {
		int contador = 1;
		
		while (contador <=20) {
		   if (contador % 2 != 0) {
			   System.out.println(contador + " � impar ");			
		   }
		   contador++;
		}
		
	}
	
}
