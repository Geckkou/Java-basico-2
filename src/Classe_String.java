
public class Classe_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String y1 =	"abc";	
		String y2 = "abc";
		
		if(y1 == y2) {
			System.out.println("variaveis y1 e y2 tem conteudos iguais ");
		}else {
			System.out.println("variaveis y1 e y2 tem conteudos diferentes" );
			
		}
        String x1 = new String ("abc");
        String x2 = new String ("abc");
        
        if (x1 == x2) {
        	System.out.println("variaveis x1 e x2 tem conteudos iguais");
        }else {
        	System.out.println("variaveis x1 e x2 tem conteudos diferentes");
        }
        if (x1.equals(x2)) {
        	System.out.println("obejetos x sao iguais");
        }else {
        	System.out.println("objetos x sao diferentes");
        	
        }
	}

}
